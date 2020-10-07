package net.avdw.hangman;

import org.tinylog.Logger;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

@Command(name = "hangman", description = "Simple ASCII hangman to be used from command line or discord.",
        versionProvider = MainVersion.class, mixinStandardHelpOptions = true,
        subcommands = {})
public class MainCli implements Runnable {
    @Spec
    private CommandSpec spec;

    /**
     * Entry point for picocli.
     */
    @Override
    public void run() {
        Logger.debug("MainCli.java entry point. Start coding here");
        spec.commandLine().usage(spec.commandLine().getOut());
    }
}
