package com.newx.headfirst.designer.command.undo.light;

import com.newx.headfirst.designer.command.undo.Command;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 */
public class LightOnCommand implements Command {

    private Light mLight;

    public LightOnCommand(Light light) {
        this.mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }

    @Override
    public void undo() {
        mLight.off();
    }
}
