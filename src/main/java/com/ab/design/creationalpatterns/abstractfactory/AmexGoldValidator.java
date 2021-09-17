package com.ab.design.creationalpatterns.abstractfactory;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
