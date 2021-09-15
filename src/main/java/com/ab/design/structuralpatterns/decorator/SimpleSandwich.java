package com.ab.design.structuralpatterns.decorator;

public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
