package com.ab.design.behavioralpatterns.command;

public class Switch {
    public void storeAndExecute(Command command){
        command.execute();
    }
}
