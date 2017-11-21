package com.newx.designer.sample01;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class Changer implements Transform{

    private Transform mTransform;

    public Changer(Transform transform) {
        this.mTransform = transform;
    }

    @Override
    public void move() {
        mTransform.move();
    }
}
