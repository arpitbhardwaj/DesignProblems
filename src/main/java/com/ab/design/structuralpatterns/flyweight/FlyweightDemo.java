package com.ab.design.structuralpatterns.flyweight;

/**
 * @author Arpit Bhardwaj
 *
 * A flyweight is an object that minimizes memory usage by sharing as much data as possible with other similar objects;
 * Example: string interning.
 *          Wrapper Class valueOf
 *
 * Flyweight design pattern solves problems:
 *      Large numbers of objects should be supported efficiently.
 *      Creating large numbers of objects should be avoided.
 */

public class FlyweightDemo {
    public static void main(String[] args) {
        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }
}
