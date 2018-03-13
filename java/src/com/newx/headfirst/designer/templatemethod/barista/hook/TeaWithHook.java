package com.newx.headfirst.designer.templatemethod.barista.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("用沸水浸泡茶叶");
    }

    @Override
    public void addCondiments() {
        System.out.println("加柠檬");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        // get the user's response
        String answer = null;

        System.out.print("请问是否要柠檬(Y/N)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("输入错误");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

}
