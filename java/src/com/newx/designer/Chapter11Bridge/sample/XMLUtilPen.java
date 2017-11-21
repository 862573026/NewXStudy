package com.newx.designer.Chapter11Bridge.sample;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.*;


/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class XMLUtilPen {

    /**
     * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     *
     * @param args
     * @return
     */
    public static Object getBean(String args) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("Designer\\src\\main\\java\\com\\designer\\Chapter11Bridge\\sample\\configPen.xml"));
            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("className");

            String packageName = null;

            if (args.equals("color")) {
                //获取包含类名的文本节点
                classNode = nl.item(0).getFirstChild();
                packageName = "com.designer.Chapter11Bridge.sample.color.";

            } else if (args.equals("pen")) {
                //获取包含类名的文本节点
                classNode = nl.item(1).getFirstChild();
                packageName = "com.designer.Chapter11Bridge.sample.pen.";
            }

            cName = packageName + classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
