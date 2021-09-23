package com.ab.design.machine.vending;

/**
 * @author Arpit Bhardwaj
 */
public class NotFullAmountPaidException extends RuntimeException {

    public NotFullAmountPaidException(String message) {
        super(message);
    }
}
