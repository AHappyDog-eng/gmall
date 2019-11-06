package com.atguigu.gmall.user.check;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import javax.servlet.ServletInputStream;
import java.io.IOException;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParsXml {
    public static Map<String,String> parseRequest(InputStream is) throws IOException {


        SAXReader reader = new SAXReader();
        HashMap<String, String> map =new HashMap<>();
        try {
            /*获取文档*/
            Document document = reader.read(is);
            /*获取根节点*/
            Element element = document.getRootElement();
            /*获取根节点的子节点*/
            List <Element> elements = element.elements();
            /*遍历所有的子节点*/
            for (Element e : elements
                 ) {
                map.put(e.getName(),e.getStringValue());
            }
            return map;
        } catch (DocumentException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println("解析文档失败");
            return null;
        }finally {
            is.close();
            is=null;
        }

    }

}
