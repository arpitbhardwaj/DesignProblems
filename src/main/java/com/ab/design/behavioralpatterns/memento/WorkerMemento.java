package com.ab.design.behavioralpatterns.memento;
/**
 * @author Arpit Bhardwaj
 *
 * Memento
 */
public class WorkerMemento {

    private String name;
    private String phone;

    public WorkerMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
