package com.ab.design.abstraction;

/**
 * @author Arpit Bhardwaj
 *
 * An abstract class cannot be private or protected same like an concrete class, though innner abstract classes can be
 * Abstract methods in an abstract class cannot be private but can be  public, protected or default.
 *
 * Abstractions can be achived by beow means
 * Structured Abstraction: Split complex operations into simpler methods
 * Class Abstraction: delegate responsibility to other class (abstract and interface)
 * Polymorphism:Abstraction layer can have different implementation. kind of an advantage of using abstraction
 *
 */
public abstract class AbstractRevenueCalculator {
    public abstract double calculate(ClientEngagement clientEngagement);
}
