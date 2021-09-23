package com.ab.design.patterns.structural.flyweight;
//Immutable
//instances of item will be flyweights
//Items has intrinsic values means which never changes

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
