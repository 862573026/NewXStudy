package com.newx.headfirst.designer.command.undo.light;

import com.newx.headfirst.designer.command.undo.Command;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 */
public class LightOffCommand implements Command{

    public Light mLight;

    @Override
    public void execute() {
        mLight.off();
    }

    @Override
    public void undo() {
        mLight.on();
    }
}
