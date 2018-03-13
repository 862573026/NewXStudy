package com.newx.headfirst.designer.state.gumballstate;

import com.newx.headfirst.designer.state.Constant;

/**
 * Created by xuzhijian on 2018/2/24 0024.
 */
public class SoldOutState implements State {

    private GumballMachine mGumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(Constant.STATE_INSERT_QUARTER_SOLD_OUT);
    }

    @Override
    public void ejectQuarter() {
        System.out.println(Constant.STATE_EJECT_WHEN_SOLD_OUT);
    }

    @Override
    public void turnCrank() {
        System.out.println(Constant.STATE_TURN_CRANK_SOLD_OUT);
    }

    @Override
    public void dispense() {
        System.out.println(Constant.STATE_DISPENSE_SOLD_OUT);
    }

    public String toString() {
        return Constant.STATE_SOLD_OUT;
    }
}
