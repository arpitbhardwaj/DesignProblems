package com.ab.design.misc;

import java.util.Stack;

public class BrowserHistory {
    Stack<String> forward;
    Stack<String> backward;
    public BrowserHistory(String homepage) {
        forward = new Stack<>();
        backward = new Stack<>();
        backward.push(homepage);
    }

    public void visit(String url) {
        while(!forward.isEmpty()){
            forward.pop();
        }
        backward.push(url);
    }

    public String back(int steps) {
        int x = backward.size()-1;
        String stepBackUrl = "";
        if(steps >= x){
            while(x-- > 0){
                forward.push(backward.pop());
            }
            stepBackUrl = backward.peek();
        }
        else {
            while(steps-- > 0){
                forward.push(backward.pop());
            }
            stepBackUrl = backward.peek();
        }
        return stepBackUrl;
    }

    public String forward(int steps) {
        int x = forward.size();
        String stepForUrl = "";
        if(steps >= x){
            while(x-- > 0){
                backward.push(forward.pop());
            }
            stepForUrl = backward.peek();
        }
        else {
            while(steps-- > 0){
                backward.push(forward.pop());
            }
            stepForUrl = backward.peek();
        }
        return stepForUrl;
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
        browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
        browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
    }
}
