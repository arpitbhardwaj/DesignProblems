package com.ab.design.patterns.creational.singleton;

/**
 * @author Arpit Bhardwaj
 */
public class EnumSingletonDemo {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;

        instance.setValue(2);
        System.out.println(instance);
    }
}
