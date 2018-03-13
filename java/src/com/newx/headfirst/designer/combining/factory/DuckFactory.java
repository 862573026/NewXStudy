package com.newx.headfirst.designer.combining.factory;

import com.newx.headfirst.designer.combining.base.*;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 没有装饰者的
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
