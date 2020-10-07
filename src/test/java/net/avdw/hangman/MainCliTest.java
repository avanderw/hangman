package net.avdw.hangman;

import org.junit.BeforeClass;
import org.junit.Test;

public class MainCliTest {

    private static CliTester cliTester;

    @BeforeClass
    public static void beforeClass() {
        cliTester = new CliTester(MainCli.class, new TestGuiceFactory(new TestModule()));
    }

    @Test(timeout = 256)
    public void testEmpty() {
        cliTester.execute().success().contains("Usage");
    }

    @Test(timeout = 256)
    public void testVersion() {
        cliTester.execute("--version").success();
    }

}