package com.ab.design.patterns.behavioral.observer;

//Observer
public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
