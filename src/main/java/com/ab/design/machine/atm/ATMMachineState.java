package com.ab.design.machine.atm;

/**
 * @author Arpit Bhardwaj
 */
public interface ATMMachineState {
    void insertDebitCard();
    void ejectDebitCard();
    void enterPinAndWithdrawMoney();
}
