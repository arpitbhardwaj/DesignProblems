package com.ab.design.patterns.structural.decorator;

public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
