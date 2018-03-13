package com.newx.headfirst.designer.combining.adapter;

import com.newx.headfirst.designer.combining.base.*;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 鸭子模拟器 -> 加入鹅的适配器
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose()); //通过适配器，将鹅也转成Quackable

        System.out.println("\n-- 鸭子模拟器 --");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
