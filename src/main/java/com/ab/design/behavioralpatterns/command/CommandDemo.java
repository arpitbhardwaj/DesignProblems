package com.ab.design.behavioralpatterns.command;

/**
 * @author Arpit Bhardwaj
 *
 * Use Command Pattern
 *      when one functional interface with a method that different lambda expressions will define; each lambda expression will represent a command
 */
public class CommandDemo {

    static class Task implements Runnable{//Runnable act as command interface
        //Task act as concrete command
        int n1;
        int n2;

        public Task(int n1, int n2) {
            this.n1 = n1;
            this.n2 = n2;
        }
        @Override
        public void run() {//execute method
            System.out.println(n1*n2);//receiver
        }
    }

    public static void main(String[] args) {
        Task task = new Task(2,6);//encapsulate request
        Thread thread = new Thread(task);
        thread.start();//invoker
    }
}


