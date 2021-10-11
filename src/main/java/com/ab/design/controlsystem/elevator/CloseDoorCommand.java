package com.ab.design.controlsystem.elevator;

/**
 * @author Arpit Bhardwaj
 */
public class CloseDoorCommand extends Command{

    ElevatorCar elevatorCar;

    public CloseDoorCommand(ElevatorCar elevatorCar, boolean isExternal) {
        super(elevatorCar, isExternal);
        this.elevatorCar = elevatorCar;
    }

    @Override
    protected void doExecute() {
        if (!elevatorCar.isDoorClosed()){
            elevatorCar.closeDoor();
        }
    }
}
