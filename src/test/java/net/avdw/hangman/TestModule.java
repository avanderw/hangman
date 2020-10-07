package net.avdw.hangman;

import com.google.inject.AbstractModule;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class TestModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(List.class).to(LinkedList.class);
        bind(Set.class).to(HashSet.class);
        bind(ResourceBundle.class).toInstance(ResourceBundle.getBundle("messages", Locale.getDefault()));
    }
}
