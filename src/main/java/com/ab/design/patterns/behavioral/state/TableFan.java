package com.ab.design.patterns.behavioral.state;

public class TableFan {

    State offState;
    State lowState;
    State mediumState;

    State state;

    public TableFan() {
        offState = new OffState(this);
        lowState = new LowState(this);
        mediumState = new MediumState(this);

        state =offState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOffState() {
        return offState;
    }

    public State getLowState() {
        return lowState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public void pullChain() {
        /*if(state == OFF){
            System.out.println("Turning fan on to low");
            state = LOW;
        }
        else if (state == LOW){
            System.out.println("Turning fan on to Med");
            state = MED;
        }else if (state == MED){
            System.out.println("Turning fan off");
            state = OFF;
        }*/
        state.handleRequest();
    }

    @Override
    public String toString() {
        /*if(state == OFF){
            return "Fan is off";
        } else if (state == LOW){
            return "Fan is low";
        } else if (state == MED){
            return "Fan is med";
        }
        return "Invalid State";*/
        return state.toString();
    }
}
