package com.newx.headfirst.designer.factory.pizzaaf;

import com.newx.headfirst.designer.factory.pizzaaf.raw.base.*;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public abstract class Pizza {

    public String mName;

    public Dough mDough;
    public Sauce mSauce;
    public Veggies mVeggies[];
    public Cheese mCheese;
    public Pepperoni mPepperoni;
    public Clams mClams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("----" + mName + "----\n");

        if (mDough != null) {
            result.append(mDough);
            result.append("\n");
        }

        if (mSauce != null) {
            result.append(mSauce);
            result.append("\n");
        }

        if (mCheese != null) {
            result.append(mCheese);
            result.append("\n");
        }

        if (mVeggies != null) {
            for (int i = 0; i < mVeggies.length; i++) {
                result.append(mVeggies[i]);
                if (i < mVeggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }

        if (mClams != null) {
            result.append(mClams);
            result.append("\n");
        }

        if (mPepperoni != null) {
            result.append(mPepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
