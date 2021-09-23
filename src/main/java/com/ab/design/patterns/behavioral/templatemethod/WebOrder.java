package com.ab.design.patterns.behavioral.templatemethod;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Get items from cart");
        System.out.println("set gift preferences");
        System.out.println("set delivery address");
        System.out.println("set billing address");

    }

    @Override
    public void doPayment() {
        System.out.println("process payment with card");
    }

    @Override
    public void doReceipt() {
        System.out.println("email receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("ship the item to address");
    }
}
