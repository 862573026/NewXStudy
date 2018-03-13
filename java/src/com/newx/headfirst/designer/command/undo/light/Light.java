package com.newx.headfirst.designer.command.undo.light;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 */
public class Light {

    private String mLocation;
    private int mLevel;

    public Light(String location) {
        this.mLocation = location;
    }

    public void on() {
        mLevel = 100;
        System.out.println("灯 -> 开启");
    }

    public void off() {
        mLevel = 0;
        System.out.println("灯 -> 关闭");
    }

    public void dim(int level) {
        this.mLevel = level;
        if (mLevel == 0) {
            off();
        } else {
            System.out.println("灯 亮度调节为" + mLevel + "%");
        }
    }

    public int getLevel() {
        return mLevel;
    }
}
