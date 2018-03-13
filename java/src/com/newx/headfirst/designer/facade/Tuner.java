package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 * 调谐器
 */
public class Tuner extends BasePlayer {

    private Amplifier mAmplifier;
    private double mFrequency; //频率

    public Tuner(String description, Amplifier amplifier) {
        mDescription = description;
        mAmplifier = amplifier;
    }

    public void setFrequency(double frequency) {
        System.out.println(mDescription + " 设置频率为：" + frequency);
        mFrequency = frequency;
    }

    public void setAM() {
        System.out.println(mDescription + " 设置为AM模式");
    }

    public void setFM() {
        System.out.println(mDescription + " 设置为FM模式");
    }

}
