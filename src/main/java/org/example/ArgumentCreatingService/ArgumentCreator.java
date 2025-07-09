package org.example.ArgumentCreatingService;

import org.example.Model.Argument;

public interface ArgumentCreator {
    Argument createArgument(String main_argument);
    Argument createArgument(String main_argument, String extended_argument, String[] parameters);
    Argument createArgument(String main_argument, String extended_argument);

    void help();
}
