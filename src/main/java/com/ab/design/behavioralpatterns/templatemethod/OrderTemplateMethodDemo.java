package com.ab.design.behavioralpatterns.templatemethod;

public class OrderTemplateMethodDemo {
    public static void main(String[] args) {
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        OrderTemplate storeOrder= new StoreOrder();
        storeOrder.processOrder();
    }
}
