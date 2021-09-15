package com.ab.design.structuralpatterns.decorator;

public class SandwichDecoratorDemo {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
