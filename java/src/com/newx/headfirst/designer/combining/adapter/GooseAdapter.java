package com.newx.headfirst.designer.combining.adapter;

import com.newx.headfirst.designer.combining.base.Quackable;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class GooseAdapter implements Quackable {
    private Goose mGoose;

    public GooseAdapter(Goose goose) {
        mGoose = goose;
    }

    @Override
    public void quack() {
        mGoose.honk();
    }
}
