package com.newx.headfirst.designer.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xuzhijian on 2018/3/1 0001.
 */
public class ImageComponent extends JComponent {

    private Icon mIcon;

    public ImageComponent(Icon icon) {
        mIcon = icon;
    }

    public void setIcon(Icon icon) {
        mIcon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = mIcon.getIconWidth();
        int h = mIcon.getIconHeight();
        int x = (800 - w)/2;
        int y = (600 - h)/2;
        mIcon.paintIcon(this, g, x, y);
    }
}
