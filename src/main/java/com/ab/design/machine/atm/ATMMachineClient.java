package com.ab.design.machine.atm;

/**
 * @author Arpit Bhardwaj
 */
public class ATMMachineClient {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.enterPinAndWithdrawMoney();

        System.out.println("\n*******************************************************");

        atmMachine.insertDebitCard();
        atmMachine.enterPinAndWithdrawMoney();
        atmMachine.ejectDebitCard();

    }
}
