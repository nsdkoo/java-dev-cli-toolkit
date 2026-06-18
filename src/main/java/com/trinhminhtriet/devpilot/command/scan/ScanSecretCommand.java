package com..DevCliToolkit.command.scan;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "secret",
    description = "Scan source code for secrets (passwords, tokens, API keys, ...)",
    mixinStandardHelpOptions = true
)
public class ScanSecretCommand implements Runnable {

  @Option(names = {"--path", "-p"}, description = "Path to scan", defaultValue = ".")
  private File path;

  @Option(names = {"--exclude", "-e"}, description = "Exclude pattern (glob)")
  private String exclude;

  @Option(names = {"--report", "-r"}, description = "Output report file")
  private File reportFile;

  @Override
  public void run() {
    Pattern secretPattern = Pattern.compile(
        "(password|passwd|token|api[_-]?key|secret|PRIVATE_KEY|AWS_SECRET_ACCESS_KEY)[\"'=:\s]+[\\w\\-\\+/=]{8,}",
        Pattern.CASE_INSENSITIVE
    );
    List<File> files = FileWalker.getAllSourceFiles(path, exclude);
    StringBuilder report = new StringBuilder();
    for (File file : files) {
      try {
        List<String> lines = Files.readAllLines(file.toPath());
        for (int i = 0; i < lines.size(); i++) {
          Matcher m = secretPattern.matcher(lines.get(i));
          if (m.find()) {
            String found = String.format("%s:%d: %s", file.getPath(), i + 1, lines.get(i).trim());
            System.out.println(found);
            report.append(found).append("\n");
          }
        }
      } catch (Exception ignored) {
      }
    }
    if (reportFile != null) {
      try {
        Files.writeString(reportFile.toPath(), report.toString());
        System.out.println("Report written to " + reportFile.getPath());
      } catch (Exception e) {
        System.err.println("Failed to write report: " + e.getMessage());
      }
    }
  }
}

// Utility class to walk files
class FileWalker {

  private static final List<String> DEFAULT_EXCLUDES = List.of(
      "node_modules", ".git", "target", "build", "dist", "__pycache__", ".venv", "venv");

  public static List<File> getAllSourceFiles(File dir, String excludePattern) {
    try {
      return Files.walk(dir.toPath())
          .filter(p -> Files.isRegularFile(p))
          .filter(p -> isSourceFile(p.getFileName().toString()))
          .filter(p -> !isExcluded(p, excludePattern))
          .map(Path::toFile)
          .toList();
    } catch (Exception e) {
      return List.of();
    }
  }

  private static boolean isSourceFile(String name) {
    return name.endsWith(".java") || name.endsWith(".py") || name.endsWith(".js")
        || name.endsWith(".ts") || name.endsWith(".go") || name.endsWith(".rs");
  }

  private static boolean isExcluded(Path path, String excludePattern) {
    String normalized = path.toString().replace('\\', '/');
    for (String part : DEFAULT_EXCLUDES) {
      if (normalized.contains("/" + part + "/") || normalized.endsWith("/" + part)) {
        return true;
      }
    }
    if (excludePattern != null && !excludePattern.isBlank()) {
      return normalized.contains(excludePattern.replace('\\', '/'));
    }
    return false;
  }
}

