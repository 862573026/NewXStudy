package com.newx.headfirst.designer.combining.observer;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 呱呱叫学家 -> 观察者
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("呱呱叫学家：" + duck + " 刚刚叫了");
    }

    public String toString() {
        return "呱呱叫学家";
    }
}
