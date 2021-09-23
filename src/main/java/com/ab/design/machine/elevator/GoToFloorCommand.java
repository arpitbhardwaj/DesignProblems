package com.ab.design.machine.elevator;

import java.util.logging.Logger;

/**
 * @author Arpit Bhardwaj
 */
public class GoToFloorCommand extends Command{

    Lift lift;
    private int floor = 1;
    private static final Logger log = Logger.getLogger(GoToFloorCommand.class.getName());

    public GoToFloorCommand(Lift lift, boolean isExternal, int floor) {
        super(lift, isExternal);
        this.lift = lift;
        this.floor = floor;
    }

    @Override
    protected void doExecute() {
        int currFloor = lift.currentFloor();
        if (floor == currFloor){
            log.info("Invalid Floor Pressed");
        }
        if (floor > currFloor){
            lift.goLiftUp(floor);
        }else {
            lift.goLiftDown(floor);
        }
    }
}
