package com.ab.design.behavioralpatterns.chainofresponsibility;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything");
    }
}