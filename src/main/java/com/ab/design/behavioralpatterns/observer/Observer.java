package com.ab.design.behavioralpatterns.observer;

//Observer
public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
