package com.ab.design.abstraction;

/**
 * @author Arpit Bhardwaj
 */
public class HourlyRateCalculatorAbstract extends AbstractRevenueCalculator {
    public static final double HOURLY_RATE  = 50;
    private final double hourlyRate;

    public HourlyRateCalculatorAbstract(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculate(ClientEngagement clientEngagement) {
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}
