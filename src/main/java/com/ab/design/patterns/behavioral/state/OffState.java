package com.ab.design.patterns.behavioral.state;

public class OffState extends State {
    private TableFan fan;
    public OffState(TableFan tableFan) {
        this.fan = tableFan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low");
        fan.setState(fan.getLowState());
    }

    @Override
    public String toString() {
        return "Fan is Off";
    }
}
