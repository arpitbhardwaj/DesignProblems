package com.ab.design.creationalpatterns.builder;

public class LunchOrderTelescoping {
    //the produced object from this telescoping pattern is mutable but have limited constructive nature
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTelescoping(String bread) {
        this.bread = bread;
    }

    public LunchOrderTelescoping(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTelescoping(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderTelescoping(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
