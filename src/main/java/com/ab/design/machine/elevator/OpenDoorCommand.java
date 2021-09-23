package com.ab.design.machine.elevator;

/**
 * @author Arpit Bhardwaj
 */
public class OpenDoorCommand extends Command{
    Lift lift;

    public OpenDoorCommand(Lift lift, boolean isExternal) {
        super(lift, isExternal);
        this.lift = lift;
    }

    @Override
    protected void doExecute() {
        if (!lift.isDoorOpen()){
            lift.openDoor();
        }
    }
}
