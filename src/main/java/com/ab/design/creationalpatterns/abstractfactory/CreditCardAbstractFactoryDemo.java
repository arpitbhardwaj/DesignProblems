package com.ab.design.creationalpatterns.abstractfactory;

import static com.ab.design.creationalpatterns.abstractfactory.CardType.*;

public class CreditCardAbstractFactoryDemo {

    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard creditCard = creditCardFactory.getCreditCard(PLATINUM);
        System.out.println(creditCard.getClass());

        creditCardFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard anotherCreditCard = creditCardFactory.getCreditCard(GOLD);
        System.out.println(anotherCreditCard.getClass());

    }
}
