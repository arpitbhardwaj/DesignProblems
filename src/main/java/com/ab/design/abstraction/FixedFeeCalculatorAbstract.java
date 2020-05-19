package com.ab.design.abstraction;

/**
 * @author Arpit Bhardwaj
 */
public class FixedFeeCalculatorAbstract extends AbstractRevenueCalculator {
    private static final double FIXED_FEE  = 500;
    private final double fixedFee;

    public FixedFeeCalculatorAbstract(double fixedFee) {
        this.fixedFee = fixedFee;
    }

    @Override
    public double calculate(ClientEngagement clientEngagement) {
        return fixedFee;
    }
}
