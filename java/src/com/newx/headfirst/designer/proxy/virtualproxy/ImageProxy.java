package com.newx.headfirst.designer.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by xuzhijian on 2018/3/1 0001.
 */
public class ImageProxy implements Icon {

    private ImageIcon mImageIcon;

    private URL mImageURL;

    private Thread retrievalThread;

    private boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        mImageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (mImageIcon != null) {
            mImageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;

                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            mImageIcon = new ImageIcon(mImageURL, "CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (mImageIcon != null) {
            return mImageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (mImageIcon != null) {
            return mImageIcon.getIconHeight();
        } else {
            return 600;
        }
    }
}
