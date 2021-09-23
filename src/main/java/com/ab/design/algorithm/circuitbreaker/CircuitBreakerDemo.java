package com.ab.design.algorithm.circuitbreaker;

import java.net.MalformedURLException;
import java.time.Duration;

public class CircuitBreakerDemo {
    public static void main(String[] args) {
        CircuitBreaker cb = new CircuitBreaker(3000,5, Duration.ofMillis(2000));

        Service thirdPartyServ = null;
        try {
            thirdPartyServ = new ThirdPartyService("http://localhost:8080/flakycall");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            String response = cb.call(thirdPartyServ);
        }catch (Exception e){}
    }
}
