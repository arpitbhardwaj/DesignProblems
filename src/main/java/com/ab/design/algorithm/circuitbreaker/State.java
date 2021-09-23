package com.ab.design.algorithm.circuitbreaker;

/**
 * @author Arpit Bhardwaj
 *
 * Once serviceA “knows” that serviceB is down, there is no need to make request to serviceB. serviceA should return cached data or timeout error as soon as it can. This is the OPEN state of the circuit
 * Once serviceA “knows” that serviceB is up, we can CLOSE the circuit so that request can be made to serviceB again.
 * Periodically make fresh calls to serviceB to see if it is successfully returning the result. This state is HALF-OPEN.
 *
 */
public enum State {
    CLOSED,
    HALF_OPEN,
    OPEN
}
