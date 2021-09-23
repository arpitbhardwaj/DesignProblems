package com.ab.design.patterns.creational.abstractfactory;

public abstract class CreditCard {
    protected int cardNumberLength;
    protected int cvcNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCvcNumber() {
        return cvcNumber;
    }

    public void setCvcNumber(int cvcNumber) {
        this.cvcNumber = cvcNumber;
    }
}
