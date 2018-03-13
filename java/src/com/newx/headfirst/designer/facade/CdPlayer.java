package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 */
public class CdPlayer extends BasePlayer {

    private String mDescription;
    private int mCurrentTrack;
    private Amplifier mAmplifier;
    private String mTitle;

    public CdPlayer(String description, Amplifier amplifier) {
        this.mDescription = description;
        this.mAmplifier = amplifier;
    }

    public void eject() {
        mTitle = null;
        System.out.println(mDescription + " 弹出");
    }

    public void play(String title) {
        mTitle = title;
        mCurrentTrack = 0;
        System.out.println(mDescription + " 开始播放 \"" + mTitle + "\"");
    }

    public void play(int track) {
        if (mTitle == null) {
            System.out.println(mDescription + " 播放失败,CD未插入");
        } else {
            mCurrentTrack = track;
            System.out.println(mCurrentTrack + " 播放进度：" + mCurrentTrack);
        }
    }

    public void stop() {
        mCurrentTrack = 0;
        System.out.println(mDescription + " 停止播放");
    }

    public void pause() {
        System.out.println(mDescription + " \"" + mTitle + "\"暂停播放");
    }

}
