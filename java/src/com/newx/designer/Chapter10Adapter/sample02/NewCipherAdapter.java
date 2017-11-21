package com.newx.designer.Chapter10Adapter.sample02;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class NewCipherAdapter extends DataOperation {

    private NewCipher cipher;

    public NewCipherAdapter() {
        cipher = new NewCipher();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
