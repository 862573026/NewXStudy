package com.newx.headfirst.designer.combining.observer;


/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 可观察的接口
 */
public interface QuackObservable {

    public void registerObserver(Observer observer); //注册观察者

    public void notifyObservers();//通知观察者
}
