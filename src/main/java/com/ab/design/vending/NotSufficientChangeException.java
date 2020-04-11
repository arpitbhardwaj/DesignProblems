package com.ab.design.vending;

/**
 * @author Arpit Bhardwaj
 */
public class NotSufficientChangeException extends RuntimeException {

    public NotSufficientChangeException(String message) {
        super(message);
    }
}
