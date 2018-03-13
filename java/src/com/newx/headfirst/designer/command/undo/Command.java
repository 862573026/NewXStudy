package com.newx.headfirst.designer.command.undo;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 */
public interface Command {

    public void execute();

    public void undo();
}
