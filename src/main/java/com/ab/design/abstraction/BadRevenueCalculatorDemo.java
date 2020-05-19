package com.ab.design.abstraction;

/**
 * @author Arpit Bhardwaj
 */
public class BadRevenueCalculatorDemo {
    public static void main(String[] args) {
        ClientEngagement clientEngagement = new ClientEngagement("TCS",15,1500);
        double hourly = BadRevenueCalculator.price("Hourly", clientEngagement);
        System.out.println("Hourly : " + hourly);
        double fixedFee = BadRevenueCalculator.price("FixedFee", clientEngagement);
        System.out.println("FixedFee : " + fixedFee);
        double royalityPercentage = BadRevenueCalculator.price("RoyalityPercentage", clientEngagement);
        System.out.println("RoyalityPercentage : " + royalityPercentage);
    }
}
