package com.newx.headfirst.designer.templatemethod.frame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "模板方法模式!!!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Head First 设计模式");
    }

}
