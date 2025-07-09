package org.example;

import org.example.ArgumentCreatingService.PrintArgumentCreationClass;
import org.example.Model.Argument;

import java.util.Scanner;

/**
 * Problem: Multiple Teams to create CLI Tool
 * Each Team has own way of parsing arguments - Duplication of code and not normalized arguments
 * Argument Parser for the CLI Tool
 *
 * Req :
 * Each team will implement and define own arguments
 * Dont know what the arguments will be
 * ex : ls with -a : capture and follow the arguments
 *
 * Structure:
 * main_argument extended_argument parameters
 */
public class Main {
    public static void main(String[] args) {

        // print -en "Hello Worlds"
        System.out.println("Hello, World!");
        CLIArguments arguments = CLIArguments.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Main Argument: ");
        String mainArgument = sc.nextLine();
        System.out.println("Enter Extended Argument: ");
        String extendedArguement = sc.nextLine();
        System.out.println("Enter Argument Parameters with a space in between: ");
        String parametsString = sc.nextLine();
        String[] parameters = parametsString.split(" ");
        Argument argument;

        PrintArgumentCreationClass creationClass = new PrintArgumentCreationClass();
        if(extendedArguement == "" && parameters.length == 0) argument = creationClass.createArgument(mainArgument);
        if(parameters.length == 0) argument = creationClass.createArgument(mainArgument,extendedArguement);
        else argument = creationClass.createArgument(mainArgument,extendedArguement,parameters);

        arguments.createArgument(argument);
        Argument arg = arguments.getArgument(argument.getMain_argument());
        arg.callArgument();
        System.out.println("Enter Argument: ");
        String enteredCommands = sc.nextLine();
        String[] commands = enteredCommands.split(" ");
        String mainArg = commands[0];
        String extended = commands[1];
        String[] paraters = new String[] {"Hello","World"};
        Argument argument1 = arguments.getArgument(mainArgument);
        argument1.setMain_argument(extended);
        argument1.setParameters(parameters);
        argument1.callArgument();

    }
}