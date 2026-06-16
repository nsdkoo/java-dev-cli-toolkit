package com..DevCliToolkit.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import picocli.AutoComplete;
import picocli.CommandLine.Command;

@Slf4j
@Component
@Command(
    name = "autocomplete",
    description = "Generate shell auto-completion script"
)
public class AutoCompletionCommand implements Runnable {

  @Override
  public void run() {
    try {
      AutoComplete.main(new String[]{
          "-n", "DevCliToolkit",
          "-o", "DevCliToolkit_completion.sh",
          "com..DevCliToolkit.command.common.VersionCommand"
      });
      log.info("Generated autocomplete script: DevCliToolkit_completion.sh");
    } catch (Exception e) {
      log.info(e.getMessage());
      e.printStackTrace();
    }
  }
}

