package com.ab.design.behavioralpatterns.command;

public class onCommand implements Command {
    private Light light;

    public onCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
