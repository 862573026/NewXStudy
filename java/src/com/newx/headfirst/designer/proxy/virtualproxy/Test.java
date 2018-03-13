package com.newx.headfirst.designer.proxy.virtualproxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by xuzhijian on 2018/3/1 0001.
 */
public class Test {

    private ImageComponent mImageComponent;
    private JFrame mFrame = new JFrame("CD Cover Viewer");
    private JMenuBar mMenuBar;
    private JMenu mMenu;
    private Hashtable cds = new Hashtable();

    public static void main(String[] args) {
        try {
            Test test = new Test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Test() throws Exception {
        cds.put("Ambient: Music for Airports", "http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Buddha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima", "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma", "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.", "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure", "http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2", "http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");

        URL initialURL = new URL((String) cds.get("Selected Ambient Works, Vol. 2"));
        mMenuBar = new JMenuBar();
        mMenu = new JMenu("Favorite CDs");
        mMenuBar.add(mMenu);
        mFrame.setJMenuBar(mMenuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            mMenu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mImageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                    mFrame.repaint();
                }
            });
        }

        // set up frame and menus

        Icon icon = new ImageProxy(initialURL);
        mImageComponent = new ImageComponent(icon);
        mFrame.getContentPane().add(mImageComponent);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setSize(800, 600);
        mFrame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
