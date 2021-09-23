package com.ab.design.patterns.structural.decorator;

public class SandwichDecoratorDemo {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
