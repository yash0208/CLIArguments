package org.example.ArgumentCreatingService;

import org.example.Model.Argument;

import java.util.Arrays;

public class PrintArgumentCreationClass implements ArgumentCreator{

    private Argument argument;


    @Override
    public Argument createArgument(String main_argument) {
        argument = new Argument(main_argument);
        return argument;
    }

    @Override
    public Argument createArgument(String main_argument, String extended_argument, String[] parameters) {
        argument = new Argument(main_argument,extended_argument,parameters);
        return  argument;
    }

    @Override
    public Argument createArgument(String main_argument, String extended_argument) {
        argument = new Argument(main_argument,extended_argument);
        return argument;
    }

    public void callArgument(){
        if(argument.getParameters().length != 0) System.out.println(Arrays.asList(argument));
        else System.out.println("Nothing to print");
    }

    @Override
    public void help() {

    }
}
