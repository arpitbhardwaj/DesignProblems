package com.ab.design.machine.vending;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public interface VendingMachineState {
    void insertCurrency(Currency coin);
    long selectItem(Item item);
    ItemAndCurrencyHolder<Item, List<Currency>> collectItemAndChange();
    List<Currency> refund();
    void reset();
}
