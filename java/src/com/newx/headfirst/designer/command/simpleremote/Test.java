package com.newx.headfirst.designer.command.simpleremote;

import com.newx.headfirst.designer.command.simpleremote.door.GarageDoor;
import com.newx.headfirst.designer.command.simpleremote.door.GarageDoorOpenCommand;
import com.newx.headfirst.designer.command.simpleremote.light.Light;
import com.newx.headfirst.designer.command.simpleremote.light.LightOnCommand;

/**
 * Created by xuzhijian on 2018/2/12 0012.
 */
public class Test {

    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
