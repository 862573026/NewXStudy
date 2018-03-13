package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 */
public class Screen extends BasePlayer {

    public Screen(String description) {
        mDescription = description;
    }

    @Override
    public void on() {
        down();
    }

    public void off() {
        up();
    }

    public void down() {
        System.out.println(mDescription + " 放下");
    }

    public void up() {
        System.out.println(mDescription + " 升起");
    }
}
