package com.ab.design.machine.atm;

/**
 * @author Arpit Bhardwaj
 */
public class HasDebitCardState implements ATMMachineState {
    @Override
    public void insertDebitCard() {
        System.out.println("Debit Card is already there,So you cannot insert the Debit Card ...");
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("Debit Card is ejected...");
    }

    @Override
    public void enterPinAndWithdrawMoney() {
        System.out.println("Pin number has been entered correctly and money has been withdrawn...");
    }
}
