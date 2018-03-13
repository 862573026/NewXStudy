package com.newx.headfirst.designer.combining.observer;

import com.newx.headfirst.designer.combining.adapter.Goose;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\n-- 鸭子模拟器：带观察者 --");

        //创建 有生命体质的一个种群
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(goose);

        //创建红头鸭种群
        Flock flockOfRedHeadDucks = new Flock();
        Quackable redHeadOne = duckFactory.createRedheadDuck();
        Quackable redHeadTwo = duckFactory.createRedheadDuck();
        Quackable redHeadThree = duckFactory.createRedheadDuck();
        Quackable redHeadFour = duckFactory.createRedheadDuck();

        flockOfRedHeadDucks.add(redHeadOne);
        flockOfRedHeadDucks.add(redHeadTwo);
        flockOfRedHeadDucks.add(redHeadThree);
        flockOfRedHeadDucks.add(redHeadFour);

        flockOfDucks.add(flockOfRedHeadDucks);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);
//        simulate(redheadDuck);
        System.out.println("鸭子一共叫了：" + QuackCounter.getQuacks() + "次");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
