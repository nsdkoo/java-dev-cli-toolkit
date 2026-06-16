package com..DevCliToolkit.command;

import com..DevCliToolkit.command.common.ConfigCommand;
import com..DevCliToolkit.command.common.InfoCommand;
import com..DevCliToolkit.command.common.ListCommand;
import com..DevCliToolkit.command.common.VersionCommand;
import com..DevCliToolkit.command.file.EnvCommand;
import com..DevCliToolkit.command.file.FileCommand;
import com..DevCliToolkit.command.git.GitCommand;
import com..DevCliToolkit.command.mfa.MfaCommand;
import com..DevCliToolkit.command.project.ProjectCommand;
import com..DevCliToolkit.command.scan.ScanCommand;
import com..DevCliToolkit.command.standalone.FigletCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Command;

@Slf4j
@Component
@Command(
    name = "DevCliToolkit",
    mixinStandardHelpOptions = true,
    version = "DevCliToolkit 1.0.0",
    description = "\uD83D\uDE80 All-in-one CLI toolkit for developers: scaffold, manage, automate, and boost productivity across languages!",
    subcommands = {
        UICommand.class,
        StrapiCommand.class,
        GitCommand.class,
        FileCommand.class,
        ListCommand.class,
        FigletCommand.class,
        VersionCommand.class,
        InfoCommand.class,
        ConfigCommand.class,
        ScanCommand.class,
        EnvCommand.class,
        ProjectCommand.class,
        AutoCompletionCommand.class,
        DnsRecordCommand.class,
        MfaCommand.class
    }
)
public class RootCommand implements Runnable {

  @Override
  public void run() {
    log.info("Use --help to see available commands.");
  }
}

