package com.newx.headfirst.designer.command.simpleremote;

/**
 * Created by xuzhijian on 2018/2/12 0012.
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
