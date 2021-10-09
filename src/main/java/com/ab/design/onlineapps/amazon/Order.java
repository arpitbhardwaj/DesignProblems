package com.ab.design.onlineapps.amazon;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderNo;
    //private OrderStatus status;
    private Date orderDate;

    //to check in which stage order is
    private List<OrderLog> orderLogList;

    public boolean sendForShipment(){return false;};
    //public boolean makePayment(Payment payment){return false;};
    public boolean addOrderLog(OrderLog orderLog){return false;};
}
