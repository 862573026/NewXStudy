package com.newx.designer.Chapter10Adapter.sample02;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public abstract class DataOperation {

    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public abstract String doEncrypt(int key, String ps);
}
