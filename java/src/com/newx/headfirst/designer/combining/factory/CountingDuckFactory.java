package com.newx.headfirst.designer.combining.factory;

import com.newx.headfirst.designer.combining.base.*;
import com.newx.headfirst.designer.combining.decorator.QuackCounter;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
