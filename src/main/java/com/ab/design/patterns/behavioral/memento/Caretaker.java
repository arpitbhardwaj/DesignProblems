package com.ab.design.patterns.behavioral.memento;

import java.util.Stack;
/**
 * @author Arpit Bhardwaj
 *
 * Caretaker
 */
public class Caretaker {

    Stack<WorkerMemento> workerMementoStack = new Stack<>();

    public void save(Worker worker){
        workerMementoStack.push(worker.save());
    }

    public void revert(Worker worker){
        worker.revert(workerMementoStack.pop());
    }
}
