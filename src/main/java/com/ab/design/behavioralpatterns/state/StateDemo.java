package com.ab.design.behavioralpatterns.state;

/**
 * @author Arpit Bhardwaj
 *
 * Allows an object to alter its behavior when its internal state changes.
 *
 * The state pattern can be interpreted as a strategy pattern,
 * which is able to switch a strategy through invocations of methods defined in the pattern's interface.
 *
 * The state pattern is set to solve two main problems:
 *      An object should change its behavior when its internal state changes.
 *      State-specific behavior should be defined independently. That is, adding new states should not affect the behavior of existing states.
 */

public class StateDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
    }
}
