package com.newx.headfirst.designer.combining.decorator;

import com.newx.headfirst.designer.combining.adapter.Goose;
import com.newx.headfirst.designer.combining.adapter.GooseAdapter;
import com.newx.headfirst.designer.combining.base.*;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 鸭子模拟器 -> 加入适配器模式
 * -> 加入装饰者模式（统计呱呱叫的次数）
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck()); //创建Quackable的时候用QuackCounter包装
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new GooseAdapter(new Goose()); //通过适配器，将鹅也转成Quackable -> 假设不想统计鹅叫的次数

        System.out.println("\n-- 鸭子模拟器 --");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("鸭子一共叫了：" + QuackCounter.getQuacks() + "次");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
