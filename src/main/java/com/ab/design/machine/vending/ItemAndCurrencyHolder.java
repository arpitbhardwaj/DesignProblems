package com.ab.design.machine.vending;

/**
 * @author Arpit Bhardwaj
 *
 * A parameterized utility class to hold item and currency.
 */
public class ItemAndCurrencyHolder<E,C> {
    private E item;
    private C currency;

    public ItemAndCurrencyHolder(E item, C currency) {
        this.item = item;
        this.currency = currency;
    }

    public E getItem() {
        return item;
    }

    public C getCurrency() {
        return currency;
    }
}
