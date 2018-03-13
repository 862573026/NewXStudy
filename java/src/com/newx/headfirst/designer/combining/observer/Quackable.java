package com.newx.headfirst.designer.combining.observer;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 因为要继承QuackObservable 所以 Quackable 重新写一个吧
 */
public interface Quackable extends QuackObservable {
    public void quack();
}
