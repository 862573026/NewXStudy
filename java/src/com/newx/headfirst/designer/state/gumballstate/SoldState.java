package com.newx.headfirst.designer.state.gumballstate;

import com.newx.headfirst.designer.state.Constant;

/**
 * Created by xuzhijian on 2018/2/24 0024.
 */
public class SoldState implements State {

    private GumballMachine mGumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(Constant.STATE_INSERT_QUARTER_SOLD);
    }

    @Override
    public void ejectQuarter() {
        System.out.println(Constant.STATE_EJECT_QUARTER_ALREADY_TURNED_CRANK);
    }

    @Override
    public void turnCrank() {
        System.out.println(Constant.STATE_TURN_CRANK_REPEATEDLY);
    }

    @Override
    public void dispense() {
        mGumballMachine.releaseBall();
        if (mGumballMachine.getCount() > 0) {
            mGumballMachine.setState(mGumballMachine.getNoQuarterState());
        } else {
            System.out.println(Constant.STATE_DISPENSE_SOLD_OUT_RIGHT_WAAY);
            mGumballMachine.setState(mGumballMachine.getSoldState());
        }
    }

    @Override
    public String toString() {
        return Constant.STATE_DISPENSE;
    }
}
