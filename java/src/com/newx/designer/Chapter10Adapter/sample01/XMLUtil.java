package com.newx.designer.Chapter10Adapter.sample01;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class XMLUtil {


    public static Object getBean() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("Designer\\src\\main\\java\\com\\designer\\Chapter10Adapter\\sample01\\config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "com.designer.Chapter10Adapter.sample01." + classNode.getNodeValue();

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
