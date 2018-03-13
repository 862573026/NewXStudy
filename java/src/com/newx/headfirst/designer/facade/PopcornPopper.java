package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 * 爆米花机
 */
public class PopcornPopper extends BasePlayer {

    public PopcornPopper(String description) {
        mDescription = description;
    }

    public void pop() {
        System.out.println(mDescription + " 制作爆米花");
    }
}
