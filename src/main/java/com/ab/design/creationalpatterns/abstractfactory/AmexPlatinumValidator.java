package com.ab.design.creationalpatterns.abstractfactory;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
