package com.ab.design.patterns.creational.builder;

public class LunchOrderBuilder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBuilder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public LunchOrderBuilder build(){
            return new LunchOrderBuilder(this);
        }
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
