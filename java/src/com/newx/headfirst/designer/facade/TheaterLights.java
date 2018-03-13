package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 * 剧院灯
 */
public class TheaterLights extends BasePlayer {

    public TheaterLights(String description) {
        this.mDescription = description;
    }

    public void dim(int level) {
        System.out.println(mDescription + " 亮度：" + level + "%");
    }
}
