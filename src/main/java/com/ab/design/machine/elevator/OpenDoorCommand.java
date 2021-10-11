package com.ab.design.machine.elevator;

/**
 * @author Arpit Bhardwaj
 */
public class OpenDoorCommand extends Command{
    ElevatorCar elevatorCar;

    public OpenDoorCommand(ElevatorCar elevatorCar, boolean isExternal) {
        super(elevatorCar, isExternal);
        this.elevatorCar = elevatorCar;
    }

    @Override
    protected void doExecute() {
        if (!elevatorCar.isDoorOpen()){
            elevatorCar.openDoor();
        }
    }
}
