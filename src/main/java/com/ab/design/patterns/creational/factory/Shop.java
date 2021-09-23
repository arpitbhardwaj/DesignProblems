package com.ab.design.patterns.creational.factory;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new ItemPage());
    }
}
