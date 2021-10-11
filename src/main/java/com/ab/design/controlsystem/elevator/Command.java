package com.ab.design.controlsystem.elevator;

import java.util.logging.Logger;

/**
 * @author Arpit Bhardwaj
 */
public abstract class Command {
    private ElevatorCar elevatorCar;
    private boolean isExternal = false;
    private static final Logger log = Logger.getLogger(Command.class.getName());

    public Command(ElevatorCar elevatorCar, boolean isExternal) {
        this.elevatorCar = elevatorCar;
        this.isExternal = isExternal;
    }

    public void execute(){
        if (!isUnsupportedOperation()){
            doExecute();
        }
    }

    protected abstract void doExecute();


    protected boolean isUnsupportedOperation(){
        if (isExternal && elevatorCar.isUnderMaintenance()){
            log.info("Currently Under Maintenance");
            return true;
        }
        return false;
    }
}
