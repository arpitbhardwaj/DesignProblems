package com.ab.design.behavioralpatterns.memento;

/**
 * @author Arpit Bhardwaj
 *
 * The memento pattern is implemented with three objects: the originator, a caretaker and a memento.
 * Process:
 * 1. Make an object (originator) itself responsible for
 *      saving its internal state to a (memento) object and
 *      restoring to a previous state from a (memento) object.
 * 2.A client (caretaker)
 *      can request a memento from the originator (to save the internal state of the originator)
 *      pass a memento back to the originator (to restore to a previous state).
 */

public class WorkerMementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Worker worker = new Worker();
        worker.setName("Arpit");
        worker.setAddress("BNB Layout");
        worker.setPhone("878675645");

        System.out.println("Worker before save " + worker);
        caretaker.save(worker);
        worker.setPhone("12345");
        caretaker.save(worker);
        System.out.println("Worker after changed number" + worker);
        worker.setPhone("767676767");
        caretaker.revert(worker);
        System.out.println("Revert to last save point" + worker);
        caretaker.revert(worker);
        System.out.println("Revert to original" + worker);
    }
}
