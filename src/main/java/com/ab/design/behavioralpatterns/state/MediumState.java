package com.ab.design.behavioralpatterns.state;

public class MediumState extends State {
    private TableFan fan;

    public MediumState(TableFan tableFan) {
        this.fan = tableFan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off");
        fan.setState(fan.getOffState());
    }

    @Override
    public String toString() {
        return "Fan is medium";
    }
}
