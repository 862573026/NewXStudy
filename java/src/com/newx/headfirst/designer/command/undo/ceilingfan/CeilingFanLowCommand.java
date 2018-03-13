package com.newx.headfirst.designer.command.undo.ceilingfan;

import com.newx.headfirst.designer.command.undo.Command;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class CeilingFanLowCommand extends CeilingFanCommand implements Command {

//    public CeilingFan ceilingFan;
//    public int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    //    public CeilingFanLowCommand(CeilingFan ceilingFan) {
//        this.ceilingFan = ceilingFan;
//    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
}
