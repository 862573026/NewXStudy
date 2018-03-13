package com.newx.headfirst.designer.combining.factory;

import com.newx.headfirst.designer.combining.base.Quackable;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
