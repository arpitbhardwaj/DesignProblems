package com.ab.design.creationalpatterns.factory;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new ItemPage());
    }
}
