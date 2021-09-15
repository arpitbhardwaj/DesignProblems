package com.ab.design.behavioralpatterns.state;

public class Fan {

    final static int OFF = 0;
    final static int LOW = 1;
    final static int MED = 2;

    int state = OFF;

    public Fan() {
    }

    public void pullChain() {
        if(state == OFF){
            System.out.println("Turning fan on to low");
            state = LOW;
        }
        else if (state == LOW){
            System.out.println("Turning fan on to Med");
            state = MED;
        }else if (state == MED){
            System.out.println("Turning fan off");
            state = OFF;
        }
    }

    @Override
    public String toString() {
        if(state == OFF){
            return "Fan is off";
        } else if (state == LOW){
            return "Fan is low";
        } else if (state == MED){
            return "Fan is med";
        }
        return "Invalid State";
    }
}
