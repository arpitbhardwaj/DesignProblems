package com.ab.design.machine.elevator;

import java.util.logging.Logger;

/**
 * @author Arpit Bhardwaj
 */
public class GoToFloorCommand extends Command{
    ElevatorCar elevatorCar;
    private int floor;
    private static final Logger log = Logger.getLogger(GoToFloorCommand.class.getName());

    public GoToFloorCommand(ElevatorCar elevatorCar, boolean isExternal, int floor) {
        super(elevatorCar, isExternal);
        this.elevatorCar = elevatorCar;
        this.floor = floor;
    }

    @Override
    protected void doExecute() {
        int currFloor = elevatorCar.currentFloor();
        if (floor == currFloor){
            log.info("Invalid Floor Pressed");
        }
        if (floor > currFloor){
            elevatorCar.goElevatorCarUp(floor);
        }else {
            elevatorCar.goElevatorCarDown(floor);
        }
    }
}
