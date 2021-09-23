package com.ab.design.patterns.behavioral.command;

public class Switch {
    public void storeAndExecute(Command command){
        command.execute();
    }
}
