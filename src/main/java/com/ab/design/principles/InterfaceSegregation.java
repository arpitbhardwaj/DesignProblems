package com.ab.design.principles;

/**
 * @author Arpit Bhardwaj
 *
 * The Interface Segregation Principle (ISP) states that clients should not be forced to depend upon interface members they do not use.
 *
 */
public class InterfaceSegregation {
    interface Messenger {
        void askForCard();
        void tellInvalidCard();
        void askForPin();
        void tellInvalidPin();
        void askForAccount();
        void tellNotEnoughMoneyInAccount();
        void tellAmountDeposited();
        void tellBalance();
    }

    public interface LoginMessenger {
        void askForCard();
        void tellInvalidCard();
        void askForPin();
        void tellInvalidPin();
    }

    public interface WithdrawalMessenger {
        void tellNotEnoughMoneyInAccount();
        void askForFeeConfirmation();
    }

    public interface QueryMessenger {
        void askForAccount();
        void tellBalance();
    }
}
