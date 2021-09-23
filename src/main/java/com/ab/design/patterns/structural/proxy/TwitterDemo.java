package com.ab.design.patterns.structural.proxy;

public class TwitterDemo {
    public static void main(String[] args) {
        TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(twitterService.getTimeline("arpitbhardwaj09"));
    }
}
