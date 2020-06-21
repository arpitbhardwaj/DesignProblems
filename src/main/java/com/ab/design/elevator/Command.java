package com.ab.design.elevator;

import java.util.logging.Logger;

/**
 * @author Arpit Bhardwaj
 */
public abstract class Command {
    private Lift lift;
    private boolean isExternal = false;
    private static final Logger log = Logger.getLogger(Command.class.getName());

    public Command(Lift lift, boolean isExternal) {
        this.lift = lift;
        this.isExternal = isExternal;
    }

    public void execute(){
        if (!isUnsupportedOperation()){
            doExecute();
        }
    }

    protected abstract void doExecute();


    protected boolean isUnsupportedOperation(){
        if (isExternal && lift.isUnderMaintenance()){
            log.info("Currently Under Maintenance");
            return true;
        }
        return false;
    }
}
