package com.newx.headfirst.designer.combining.factory;

import com.newx.headfirst.designer.combining.adapter.Goose;
import com.newx.headfirst.designer.combining.adapter.GooseAdapter;
import com.newx.headfirst.designer.combining.base.*;
import com.newx.headfirst.designer.combining.decorator.QuackCounter;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 抽象工厂模式 -> 通过工厂封装创建和装饰的行为
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory); //通过工厂间接创建鸭子
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
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
