package com.ab.design.patterns.creational.factory;

public class Blog extends Website{
    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
    }
}
