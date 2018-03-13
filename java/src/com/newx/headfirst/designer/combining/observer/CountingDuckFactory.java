package com.newx.headfirst.designer.combining.observer;

import com.newx.headfirst.designer.combining.observer.duck.DuckCall;
import com.newx.headfirst.designer.combining.observer.duck.MallardDuck;
import com.newx.headfirst.designer.combining.observer.duck.RedheadDuck;
import com.newx.headfirst.designer.combining.observer.duck.RubberDuck;

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
