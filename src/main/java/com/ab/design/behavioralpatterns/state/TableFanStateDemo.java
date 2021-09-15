package com.ab.design.behavioralpatterns.state;

public class TableFanStateDemo {
    public static void main(String[] args) {
        TableFan fan = new TableFan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);
    }
}
