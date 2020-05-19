package com.ab.design.abstraction;

import java.util.Arrays;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class AbstractRevenueCalculatorDemo {
    public static void main(String[] args) {
        ClientEngagement clientEngagement = new ClientEngagement("TCS",15,1500);
        double hourly = new HourlyRateCalculatorAbstract(50).calculate(clientEngagement);
        System.out.println("Hourly : " + hourly);
        double fixedFee = new FixedFeeCalculatorAbstract(5000).calculate(clientEngagement);
        System.out.println("FixedFee : " + fixedFee);

        List<ClientEngagement> list = Arrays.asList(
                new ClientEngagement("TCS",15,1500),
                new ClientEngagement("Cognizant",20,4000),
                new ClientEngagement("IBM",10,2000),
                new ClientEngagement("infosys",30,3000)
        );

        AbstractRevenueCalculator calculator = new HourlyRateCalculatorAbstract(HourlyRateCalculatorAbstract.HOURLY_RATE);
        double total = 0;
        for (ClientEngagement engagement:
             list) {
            total += calculator.calculate(engagement);
        }
        System.out.println("Total : " + total);


    }
}
