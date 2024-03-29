package com.ab.design.patterns.creational.builder;

/**
 * @author Arpit Bhardwaj
 *
 * due to setters the produced object from this bean pattern is mutable
 */
public class LunchOrderBean {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
