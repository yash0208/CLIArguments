package org.example;


import org.example.Model.Argument;

import java.util.HashMap;

public class CLIArguments {
    private static CLIArguments arguments;
    HashMap<String,Argument> hashMap;

    private CLIArguments(){
        hashMap = new HashMap<>();
    }

    public static CLIArguments getInstance(){
        if(arguments == null){
            return arguments = new CLIArguments();
        }
        return arguments;
    }

    //Create argument
    public boolean createArgument(Argument argument){
        if(hashMap.containsKey(argument.getMain_argument())){
            System.out.println("Argument Exist with similar format");
            return false;
        }
        else hashMap.put(argument.getMain_argument(),argument);
        return true;
    }

    public Argument getArgument(String mainArgument){
        try {
            return hashMap.get(mainArgument);
        } catch (NullPointerException e){
            System.out.println("Cannot Find Argument");
            return null;
        }
    }
}
