package com.ab.design.patterns.structural.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My AB Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
