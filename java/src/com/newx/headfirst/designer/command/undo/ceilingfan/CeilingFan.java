package com.newx.headfirst.designer.command.undo.ceilingfan;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public String location;
    public int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " 吊扇速度 - 高速");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + "  吊扇速度 - 中速");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + "  吊扇速度 - 低速");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + "  吊扇 - 关闭");
    }

    public int getSpeed() {
        return speed;
    }

}
