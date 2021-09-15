package com.ab.design.behavioralpatterns.memento;
/**
 * @author Arpit Bhardwaj
 *
 * Orginator
 */
public class Worker {
    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public WorkerMemento save(){
        return new WorkerMemento(name,phone);
    }

    public void revert(WorkerMemento workerMemento){
        this.name = workerMemento.getName();
        this.phone = workerMemento.getPhone();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
