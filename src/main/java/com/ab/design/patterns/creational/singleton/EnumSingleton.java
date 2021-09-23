package com.ab.design.patterns.creational.singleton;

/**
 * @author Arpit Bhardwaj
 *
 * The constructor is by default private in enum
 */
public enum EnumSingleton {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "value=" + value +
                '}';
    }
}
