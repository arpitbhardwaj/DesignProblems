package com.ab.design.abstraction;

/**
 * @author Arpit Bhardwaj
 */
public class BadRevenueCalculator {
    private static final double HOURLY_RATE  = 50;
    private static final double FIXED_FEE  = 500;
    private static final double ROYALITY_PERCENTAGE  = 0.15;

    public static double price(String method, ClientEngagement clientEngagement) {
        switch (method){
            case "Hourly":
                return HOURLY_RATE * clientEngagement.getHoursWorked();
            case "FixedFee":
                return FIXED_FEE;
            case "RoyalityPercentage":
                return ROYALITY_PERCENTAGE * clientEngagement.getAnticipatedRevenue();
            default:
                throw new IllegalArgumentException("unknown method");
        }
    }
}
