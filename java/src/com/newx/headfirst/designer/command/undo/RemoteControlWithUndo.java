package com.newx.headfirst.designer.command.undo;

import com.newx.headfirst.designer.command.undo.entity.CommandCouple;

import java.util.List;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 * invoker
 */
public class RemoteControlWithUndo {

    private Command[] mOnCommands;
    private Command[] mOffCommands;
    private Command mUndoCommand;

    private int mSize;

    public RemoteControlWithUndo(int size) {
        this.mSize = size;
        this.mOnCommands = new Command[mSize];
        this.mOffCommands = new Command[mSize];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            mOnCommands[i] = noCommand;
            mOffCommands[i] = noCommand;
        }
        this.mUndoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.mOnCommands[slot] = onCommand;
        this.mOffCommands[slot] = offCommand;
    }

    public void setCommands(List<CommandCouple> commands) {
        if (commands.size() > this.mSize) {
            System.out.println("命令组数量超过初始化数量");
        }
        for (int slot = 0; slot < commands.size(); slot++) {
            this.mOnCommands[slot] = commands.get(slot).getOnCommand();
            this.mOffCommands[slot] = commands.get(slot).getOffCommand();
        }
    }

    public void onButtonWasPushed(int slot) {
        mOnCommands[slot].execute();
        mUndoCommand = mOnCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        mOffCommands[slot].execute();
        mUndoCommand = mOffCommands[slot];
    }

    public void undoButtonWasPushed(){
        mUndoCommand.undo();
    }
}
