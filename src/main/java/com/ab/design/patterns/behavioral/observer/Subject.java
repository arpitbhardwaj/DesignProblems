package com.ab.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//concrete subject
public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer:observers
             ) {
            observer.update();
        }
    }

}
