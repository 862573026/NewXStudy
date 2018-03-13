package com.newx.headfirst.designer.strategy;

import com.newx.headfirst.designer.strategy.entity.DecoyDuck;
import com.newx.headfirst.designer.strategy.entity.MallardDuck;
import com.newx.headfirst.designer.strategy.entity.ModelDuck;
import com.newx.headfirst.designer.strategy.entity.RubberDuck;
import com.newx.headfirst.designer.strategy.method.FlyRocketPowered;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class Test {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck(); //绿头鸭
        RubberDuck rubberDuck = new RubberDuck(); //橡皮鸭
        DecoyDuck decoyDuck = new DecoyDuck(); //诱饵鸭
        ModelDuck modelDuck = new ModelDuck(); //模型鸭

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
