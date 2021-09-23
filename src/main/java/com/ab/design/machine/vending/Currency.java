package com.ab.design.machine.vending;

/**
 * @author Arpit Bhardwaj
 */
public enum Currency {
    PENNY(1),
    NICKLE(2),
    DIME(3),
    QUARTER(4) ;

    private int denomination;

    Currency(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }
}
