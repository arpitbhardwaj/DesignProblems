package com.ab.design.behavioralpatterns.command;

public class SwitchLightCommandDemo {
    public static void main(String[] args) {
        Light light = new Light();//Receiver
        Switch aSwitch = new Switch();//invoker

        Command command = new onCommand(light);
        aSwitch.storeAndExecute(command);

    }
}
