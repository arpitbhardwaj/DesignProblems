package com.ab.design.abstraction;

/**
 * @author Arpit Bhardwaj
 *
 * An interface cannot be private or protected same like an concrete class, though inner interface can be
 * All methods of interface are implicitly public and abstract
 * Methods in interface cannot be private/package/protected as it is implicitly public by default
 */
interface RevenueCalculator {
    double calculate(ClientEngagement clientEngagement);
}
