package com.newx.headfirst.designer.singleton;

/**
 * Created by xuzhijian on 2018/2/12 0012.
 * 双加锁
 */
public class DoubleCheckLockSingleton {

    private static volatile DoubleCheckLockSingleton mSingleton;

    private DoubleCheckLockSingleton() {

    }

    public static DoubleCheckLockSingleton getInstance() {
        if (mSingleton != null) {
            synchronized (DoubleCheckLockSingleton.class) {
                mSingleton = new DoubleCheckLockSingleton();
            }
        }
        return mSingleton;
    }
}
