package com.newx.headfirst.designer.command.undo.entity;

import com.newx.headfirst.designer.command.undo.Command;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 * 一对命令
 */
public class CommandCouple {
    private Command onCommand;
    private Command offCommand;

    public Command getOnCommand() {
        return onCommand;
    }

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public Command getOffCommand() {
        return offCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }
}
