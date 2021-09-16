package com.ab.design.creationalpatterns.factory;

public class Blog extends Website{
    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
    }
}
