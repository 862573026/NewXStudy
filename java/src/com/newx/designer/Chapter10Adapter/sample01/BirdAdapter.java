package com.newx.designer.Chapter10Adapter.sample01;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class BirdAdapter extends Bird implements Robot
{
    public void cry()
    {
        System.out.print("机器人模仿：");
        super.tweedle();
    }

    public void move()
    {
        System.out.print("机器人模仿：");
        super.fly();
    }
}
