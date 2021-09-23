package com.ab.design.patterns.behavioral.state;

public class LowState extends State {
    private TableFan fan;

    public LowState(TableFan tableFan) {
        this.fan = tableFan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to medium");
        fan.setState(fan.getMediumState());
    }

    @Override
    public String toString() {
        return "Fan is low";
    }
}
