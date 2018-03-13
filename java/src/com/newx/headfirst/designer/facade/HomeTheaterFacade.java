package com.newx.headfirst.designer.facade;

/**
 * Created by xuzhijian on 2018/2/14 0014.
 * 影院外观 - 抽取方法
 */
public class HomeTheaterFacade {

    private Amplifier mAmplifier; //音响
    private Tuner mTuner; //调谐器
    private DvdPlayer mDvdPlayer;
    private CdPlayer mCdPlayer;
    private Projector mProjector; //投影仪
    private TheaterLights mLights;
    private Screen mScreen;
    private PopcornPopper mPopcornPopper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             DvdPlayer dvdPlayer,
                             CdPlayer cdPlayer,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popcornPopper) {
        mAmplifier = amplifier;
        mTuner = tuner;
        mDvdPlayer = dvdPlayer;
        mCdPlayer = cdPlayer;
        mProjector = projector;
        mLights = lights;
        mScreen = screen;
        mPopcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("准备播放电影...");
        mPopcornPopper.on();
        mPopcornPopper.pop();
        mLights.dim(10);
        mScreen.down();
        mProjector.on();
        mProjector.wideScreenMode();
        mAmplifier.on();
        mAmplifier.setDvd(mDvdPlayer);
        mAmplifier.setSurroundSound();
        mAmplifier.setVolume(5);
        mDvdPlayer.on();
        mDvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("结束播放电影...");
        mPopcornPopper.off();
        mLights.on();
        mScreen.up();
        mProjector.off();
        mAmplifier.off();
        mDvdPlayer.stop();
        mDvdPlayer.eject();
        mDvdPlayer.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("开始播放CD...");
        mLights.on();
        mAmplifier.on();
        mAmplifier.setVolume(5);
        mAmplifier.setCd(mCdPlayer);
        mAmplifier.setStereoSound();
        mCdPlayer.on();
        mCdPlayer.play(cdTitle);
    }

    public void endCd() {
        System.out.println("结束播放CD...");
        mAmplifier.off();
        mAmplifier.setCd(mCdPlayer);
        mCdPlayer.eject();
        mCdPlayer.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("开始播放广播...");
        mTuner.on();
        mTuner.setFrequency(frequency);
        mAmplifier.on();
        mAmplifier.setVolume(5);
        mAmplifier.setTuner(mTuner);
    }

    public void endRadio() {
        System.out.println("关闭广播...");
        mTuner.off();
        mAmplifier.off();
    }
}
