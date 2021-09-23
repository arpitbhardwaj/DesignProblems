package com.ab.design.patterns.creational.builder;

public class LunchOrderBeanDemo {
    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("wheat");
        lunchOrderBean.setCondiments("lettuce");
        lunchOrderBean.setDressing("mustard");
        lunchOrderBean.setMeat("ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
        //lunchOrderBean is mutable
        lunchOrderBean.setMeat("fish");
        System.out.println(lunchOrderBean.getMeat());
    }
}
