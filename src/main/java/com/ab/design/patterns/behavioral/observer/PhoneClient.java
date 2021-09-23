package com.ab.design.patterns.behavioral.observer;

//Concrete Observer
public class PhoneClient extends Observer {

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + "sent form phone");
    }
    @Override
    void update() {
        System.out.println("Phone stream : " + subject.getState());
    }
}
