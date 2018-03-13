package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 */
public abstract class BasePlayer {

    protected String mDescription;

    public void on() {
        System.out.println(mDescription + " 开启");
    }

    public void off() {
        System.out.println(mDescription + " 关闭");
    }

    @Override
    public String toString() {
        return mDescription;
    }
}
