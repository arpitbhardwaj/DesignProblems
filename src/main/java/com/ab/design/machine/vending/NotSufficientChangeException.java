package com.ab.design.machine.vending;

/**
 * @author Arpit Bhardwaj
 */
public class NotSufficientChangeException extends RuntimeException {

    public NotSufficientChangeException(String message) {
        super(message);
    }
}
