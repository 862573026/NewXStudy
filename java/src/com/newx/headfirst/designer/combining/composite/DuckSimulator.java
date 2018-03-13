package com.newx.headfirst.designer.combining.composite;

import com.newx.headfirst.designer.combining.adapter.Goose;
import com.newx.headfirst.designer.combining.adapter.GooseAdapter;
import com.newx.headfirst.designer.combining.base.Quackable;
import com.newx.headfirst.designer.combining.decorator.QuackCounter;
import com.newx.headfirst.designer.combining.factory.AbstractDuckFactory;
import com.newx.headfirst.designer.combining.factory.CountingDuckFactory;

/**
 * Created by xuzhijian on 2018/3/2 0002.
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

        //创建 有生命体质的一个种群
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(goose);

        //创建红头鸭种群 -> 不能是一样的，不然是同个对象了，观察者模式会出问题。
        Flock flockOfRedHeadDucks = new Flock();

        Quackable redHeadOne = duckFactory.createRedheadDuck();
        Quackable redHeadTwo = duckFactory.createRedheadDuck();
        Quackable redHeadThree = duckFactory.createRedheadDuck();
        Quackable redHeadFour = duckFactory.createRedheadDuck();

        flockOfRedHeadDucks.add(redHeadOne);
        flockOfRedHeadDucks.add(redHeadTwo);
        flockOfRedHeadDucks.add(redHeadThree);
        flockOfRedHeadDucks.add(redHeadFour);

        //绿头鸭也有生命体征，加入flockOfDucks
        flockOfDucks.add(flockOfRedHeadDucks); //体现了组合模式 实现同一个接口的好处 根本不用考虑是根节点还是叶子节点

        System.out.println("所有鸭子叫：");
        simulate(flockOfDucks);

        System.out.println("鸭子一共叫了：" + QuackCounter.getQuacks() + "次");

        //加入重置叫声数量
//        QuackCounter.resetQuacks();

        System.out.println("红头鸭叫：");
        simulate(flockOfRedHeadDucks);

        System.out.println("鸭子一共叫了：" + QuackCounter.getQuacks() + "次");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
