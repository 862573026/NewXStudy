package com.newx.headfirst.designer.state.gumballstate;

import com.newx.headfirst.designer.state.Constant;

/**
 * Created by xuzhijian on 2018/2/24 0024.
 */
public class HasQuarterState implements State {

    private GumballMachine mGumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(Constant.STATE_INSERT_QUARTER_REPEATEDLY);
    }


    @Override
    public void ejectQuarter() {
        System.out.println(Constant.STATE_EJECT_QUARTER);
        mGumballMachine.setState(mGumballMachine.getHasQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println(Constant.STATE_TURN_CRANK);
        mGumballMachine.setState(mGumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println(Constant.STATE_DISPENSE_SOLD_OUT);
    }

    @Override
    public String toString() {
        return Constant.STATE_WAITING_FOR_TURN_OF_CRANK;
    }
}
