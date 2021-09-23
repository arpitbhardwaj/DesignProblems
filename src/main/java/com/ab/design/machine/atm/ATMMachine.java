package com.ab.design.machine.atm;

/**
 * @author Arpit Bhardwaj
 */
public class ATMMachine implements ATMMachineState{
    private ATMMachineState machineState;

    public ATMMachine() {
        this.machineState = new NoDebitCardState();
    }

    public ATMMachineState getMachineState() {
        return machineState;
    }

    public void setMachineState(ATMMachineState machineState) {
        this.machineState = machineState;
    }

    @Override
    public void insertDebitCard() {
        this.machineState.insertDebitCard();
        if (machineState instanceof NoDebitCardState){
            ATMMachineState hasDebitCardState = new HasDebitCardState();
            setMachineState(hasDebitCardState);
        }
    }

    @Override
    public void ejectDebitCard() {
        machineState.ejectDebitCard();
        if (machineState instanceof HasDebitCardState){
            ATMMachineState noDebitCardState = new NoDebitCardState();
            setMachineState(noDebitCardState);
        }
    }

    @Override
    public void enterPinAndWithdrawMoney() {
        machineState.enterPinAndWithdrawMoney();
    }
}
