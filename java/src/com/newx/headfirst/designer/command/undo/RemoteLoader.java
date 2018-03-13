package com.newx.headfirst.designer.command.undo;

import com.newx.headfirst.designer.command.undo.ceilingfan.CeilingFan;
import com.newx.headfirst.designer.command.undo.ceilingfan.CeilingFanHighCommand;
import com.newx.headfirst.designer.command.undo.ceilingfan.CeilingFanMediumCommand;
import com.newx.headfirst.designer.command.undo.ceilingfan.CeilingFanOffCommand;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo(7);

        CeilingFan ceilingFan = new CeilingFan("客厅");
        CeilingFanMediumCommand ceilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);//中速
        remoteControl.offButtonWasPushed(0);//关闭
        remoteControl.undoButtonWasPushed(); // 撤回 - 中速

        remoteControl.onButtonWasPushed(1); //高速
        remoteControl.undoButtonWasPushed(); //撤回 - 中速
    }
}
