package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 * 音响
 */
public class Amplifier extends BasePlayer {
    private Tuner mTuner;
    private DvdPlayer mDvd;
    private CdPlayer mCd;

    public Amplifier(String description) {
        this.mDescription = description;
    }

    /**
     * 设置立体声
     */
    public void setStereoSound() {
        System.out.println(mDescription + " 立体声模式 开启");
    }

    public void setSurroundSound() {
        System.out.println(mDescription + " 环绕声模式 开启");
    }

    public void setVolume(int level) {
        System.out.println(mDescription + " 音量设置为 " + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(mDescription + " 设置调谐器为 " + tuner);
        this.mTuner = tuner;
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println(mDescription + " 设置DVD播放器为 " + dvd);
        this.mDvd = dvd;
    }

    public void setCd(CdPlayer cd) {
        System.out.println(mDescription + " 设置CD播放器为 " + cd);
        this.mCd = cd;
    }

}
