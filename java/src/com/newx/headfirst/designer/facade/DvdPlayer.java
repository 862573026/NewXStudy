package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 */
public class DvdPlayer extends BasePlayer {

    private int mCurrentTrack;
    private Amplifier mAmplifier;
    private String mTitle;

    public DvdPlayer(String description, Amplifier amplifier) {
        mDescription = description;
        mAmplifier = amplifier;
    }

    public void eject() {
        mTitle = null;
        System.out.println(mDescription + " 弹出");
    }

    public void play(String title) {
        this.mTitle = title;
        mCurrentTrack = 0;
        System.out.println(mDescription + " 开始播放 \"" + title + "\"");
    }

    public void play(int track) {
        if (mTitle == null) {
            System.out.println(mDescription + " 播放失败，DVD未插入");
        } else {
            mCurrentTrack = track;
            System.out.println(mDescription + " 播放进度：" + mCurrentTrack);
        }
    }

    public void stop() {
        mCurrentTrack = 0;
        System.out.println(mDescription + " 停止播放\"" + mTitle + "\"");
    }

    public void pause() {
        System.out.println(mDescription + " 暂停播放\"" + mTitle + "\"");
    }

    public void setTwoChannelAudio() {
        System.out.println(mDescription + " 设置双声道");
    }

    public void setSurroundAudio() {
        System.out.println(mDescription + " 设置立体声");
    }

}
