package com.ab.design.machine.atm;

/**
 * @author Arpit Bhardwaj
 */
public class NoDebitCardState implements ATMMachineState {
    @Override
    public void insertDebitCard() {
        System.out.println("DebitCard inserted ....");
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("No Debit Card in ATM Machine slot, so you cannot eject the Debit Card...");
    }

    @Override
    public void enterPinAndWithdrawMoney() {
        System.out.println("No Debit Card in ATM Machine slot, so you cannot enter the pin and withdraw the money...");
    }
}
