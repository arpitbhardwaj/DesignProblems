package com.ab.design.behavioralpatterns.strategy;

public class CreditCardStrategyDemo {
    public static void main(String[] args) {
        CreditCard amCreditCard = new CreditCard(new AmexStrategy());

        amCreditCard.setNumber("379185883464283");
        amCreditCard.setCvv("234");
        amCreditCard.setDate("04/2020");

        System.out.println("is Amex Valid: " + amCreditCard.isValid());

        CreditCard amCreditCard2 = new CreditCard(new AmexStrategy());

        amCreditCard2.setNumber("379185883464282");
        amCreditCard2.setCvv("234");
        amCreditCard2.setDate("04/2020");

        System.out.println("is Amex Valid: " + amCreditCard2.isValid());

        CreditCard visaCreditCard = new CreditCard(new VisaStrategy());

        visaCreditCard.setNumber("4539589763663402");
        visaCreditCard.setCvv("324");
        visaCreditCard.setDate("05/2021");

        System.out.println("is Visa Valid: " + visaCreditCard.isValid());
    }
}
