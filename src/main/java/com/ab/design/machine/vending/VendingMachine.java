package com.ab.design.machine.vending;

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
    private Inventory<Currency> currencyInventory = new Inventory<>();
    private Inventory<Item> itemInventory = new Inventory<>();

    private long currentBalance;

    public VendingMachine() {
        //initialize machine with 5 coins of each denomination
        for (Currency currency:
             Currency.values()) {
            currencyInventory.put(currency, 5);
        }
        //initialize machine with 5 quantity of each item
        for (Item item:
             Item.values()) {
            itemInventory.put(item,5);
        }
    }

    @Override
    public void insertCurrency(Currency coin) {
        currentBalance += coin.getDenomination();
        currencyInventory.add(coin);
    }

    @Override
    public long selectItem(Item item) {
        if (itemInventory.hasItem(item)){
            itemInventory.deduct(item);
        }
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
