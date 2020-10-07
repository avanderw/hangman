package net.avdw.hangman;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import picocli.CommandLine;

/**
 * Test factory integrating picocli with guice. It also exposes reset functionality for CliTester.
 * <p>
 * The aim is to have one class that can be copied between projects.
 * The reason is that I hate dependency management on my own classes.
 * I have no problem with duplication, it makes code more modular.
 *
 * @version 2020-10-07: Added javadoc
 */
public final class TestGuiceFactory implements CommandLine.IFactory {
    private final Module module;
    private Injector injector;

    TestGuiceFactory(final Module module) {
        this.module = module;

        reset();
    }

    public void reset() {
        injector = Guice.createInjector(module);
    }

    @Override
    public <K> K create(final Class<K> aClass) {
        return injector.getInstance(aClass);
    }

}
