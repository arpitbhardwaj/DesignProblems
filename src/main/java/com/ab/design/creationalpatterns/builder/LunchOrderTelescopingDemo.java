package com.ab.design.creationalpatterns.builder;

public class LunchOrderTelescopingDemo {
    public static void main(String[] args) {
        LunchOrderTelescoping lunchOrderTelescoping = new LunchOrderTelescoping("wheat", "lettuce", "mustard", "ham");

        System.out.println(lunchOrderTelescoping.getBread());
        System.out.println(lunchOrderTelescoping.getCondiments());
        System.out.println(lunchOrderTelescoping.getDressing());
        System.out.println(lunchOrderTelescoping.getMeat());
    }

}
