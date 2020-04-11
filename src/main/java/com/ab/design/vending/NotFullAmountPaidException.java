package com.ab.design.vending;

/**
 * @author Arpit Bhardwaj
 */
public class NotFullAmountPaidException extends RuntimeException {

    public NotFullAmountPaidException(String message) {
        super(message);
    }
}
