package com.newx.headfirst.designer.command.simpleremote.door;

import com.newx.headfirst.designer.command.simpleremote.Command;

/**
 * Created by xuzhijian on 2018/2/12 0012.
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor mGarageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.mGarageDoor = garageDoor;
    }

    @Override
    public void execute() {
        mGarageDoor.up();
    }
}
