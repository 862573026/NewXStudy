package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 * 投影仪
 */
public class Projector extends BasePlayer {

    private DvdPlayer mDvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        mDescription = description;
        mDvdPlayer = dvdPlayer;
    }

    public void wideScreenMode() {
        System.out.println(mDescription + " 设置宽屏模式(16x9)");
    }

    public void tvMode() {
        System.out.println(mDescription + " 设置为TV模式(4x3)");
    }
}
