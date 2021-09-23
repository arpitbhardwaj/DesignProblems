package com.ab.design.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 *
 * Allows the interface of an existing class to be used as another interface.
 *
 * Adapter design pattern solves problems:
 *      How can a class be reused that does not have an interface that a client requires?
 *      How can classes that have incompatible interfaces work together?
 *      How can an alternative interface be provided for a class?
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[] {42,43, 44};
        System.out.println(integers);
        List<Integer> integerList = Arrays.asList(integers);
        System.out.println(integerList);
    }
}
