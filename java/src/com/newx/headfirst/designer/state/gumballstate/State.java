package com.newx.headfirst.designer.state.gumballstate;

/**
 * Created by xuzhijian on 2018/2/24 0024.
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
