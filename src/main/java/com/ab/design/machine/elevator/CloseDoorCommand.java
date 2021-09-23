package com.ab.design.machine.elevator;

/**
 * @author Arpit Bhardwaj
 */
public class CloseDoorCommand extends Command{

    Lift lift;

    public CloseDoorCommand(Lift lift, boolean isExternal) {
        super(lift, isExternal);
        this.lift = lift;
    }

    @Override
    protected void doExecute() {
        if (!lift.isDoorClosed()){
            lift.closeDoor();
        }
    }
}
