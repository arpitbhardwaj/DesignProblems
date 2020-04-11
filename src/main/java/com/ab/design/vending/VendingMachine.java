package com.ab.design.vending;

import java.util.List;

/**
 * @author Arpit Bhardwaj
 *
 *  Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
 *  Allow user to select products Coke(25), Pepsi(35), Soda(45)
 *  Allow user to take refund by canceling the request.
 *  Return selected product and remaining change if any
 *  Allow reset operation for vending machine supplier.
 */
public class VendingMachine implements VendingMachineState {
    @Override
    public void insertCurrency(Currency coin) {

    }

    @Override
    public long selectItem(Item item) {
        return 0;
    }

    @Override
    public ItemAndCurrencyHolder<Item, List<Currency>> collectItemAndChange() {
        return null;
    }

    @Override
    public List<Currency> refund() {
        return null;
    }

    @Override
    public void reset() {

    }
}
