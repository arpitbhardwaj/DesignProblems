package com.ab.design.patterns.creational.abstractfactory;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
