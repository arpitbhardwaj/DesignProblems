package com.ab.design.atm;

/**
 * @author Arpit Bhardwaj
 */
public interface ATMMachineState {
    void insertDebitCard();
    void ejectDebitCard();
    void enterPinAndWithdrawMoney();
}
