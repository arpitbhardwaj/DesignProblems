package com.ab.design.behavioralpatterns.observer;

public class TabletClient extends Observer {
    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message + "sent form tablet");
    }
    @Override
    void update() {
        System.out.println("Tablet stream : " + subject.getState());
    }
}
