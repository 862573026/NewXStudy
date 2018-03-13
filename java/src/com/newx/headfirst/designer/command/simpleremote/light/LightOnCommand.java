package com.newx.headfirst.designer.command.simpleremote.light;

import com.newx.headfirst.designer.command.simpleremote.Command;

/**
 * Created by xuzhijian on 2018/2/12 0012.
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
}
