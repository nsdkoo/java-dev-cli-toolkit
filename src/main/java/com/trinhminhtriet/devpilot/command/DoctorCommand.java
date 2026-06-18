package com..DevCliToolkit.command;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Command;

@Component
@Slf4j
@Command(name = "doctor", description = "Check environment, versions, system config", mixinStandardHelpOptions = true)
public class DoctorCommand implements Runnable {

  private static final String[] CHECK_COMMANDS = {
      "java -version",
      "git --version",
      "mvn -version"
  };

  @Override
  public void run() {
    System.out.println("Dev CLI Toolkit - environment check");
    System.out.println("-----------------------------------");

    for (String command : CHECK_COMMANDS) {
      printCommandResult(command);
    }
  }

  private void printCommandResult(String command) {
    System.out.printf("%n> %s%n", command);
    try {
      Process process = Runtime.getRuntime().exec(command.split(" "));
      List<String> lines = new ArrayList<>();
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
        String line;
        while ((line = reader.readLine()) != null) {
          lines.add(line);
        }
      }
      int exitCode = process.waitFor();
      if (exitCode == 0 && !lines.isEmpty()) {
        lines.forEach(System.out::println);
        System.out.println("OK");
      } else {
        System.out.println("NOT FOUND");
      }
    } catch (Exception e) {
      System.out.println("NOT FOUND (" + e.getMessage() + ")");
    }
  }
}
