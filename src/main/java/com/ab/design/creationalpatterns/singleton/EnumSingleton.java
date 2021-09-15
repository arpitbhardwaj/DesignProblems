package com.ab.design.creationalpatterns.singleton;

/**
 * @author Arpit Bhardwaj
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
