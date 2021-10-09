package com.ab.design.onlineapps.amazon;

public class Customer {
    private Account account;
    private Cart cart;
    private Order order;

    public boolean addItemFromCart(Item item){return false;}

    public boolean removeItemFromCart(Item item){return false;}

    //public OrderStatus placeOrder(Order order){}
}
