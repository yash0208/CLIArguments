package org.example.Model;

import java.util.Arrays;

public class Argument {
    private String main_argument;
    private String extended_argument;
    private String[] parameters;
    private String help_argument;

    public Argument(String main_argument, String extended_argument, String[] parameters) {
        this.main_argument = main_argument;
        this.extended_argument = extended_argument;
        this.parameters = parameters;
    }

    public Argument(String main_argument, String extended_argument) {
        this.main_argument = main_argument;
        this.extended_argument = extended_argument;
    }

    public Argument(String main_argument) {
        this.main_argument = main_argument;
    }

    public String getMain_argument() {
        return main_argument;
    }

    public void setMain_argument(String main_argument) {
        this.main_argument = main_argument;
    }

    public String getExtended_argument() {
        return extended_argument;
    }

    public void setExtended_argument(String extended_argument) {
        this.extended_argument = extended_argument;
    }

    public String[] getParameters() {
        return parameters;
    }

    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }

    public void callArgument(){
        if(parameters.length != 0) System.out.println(Arrays.asList(parameters));
        else System.out.println("Nothing to print");
    }

}
