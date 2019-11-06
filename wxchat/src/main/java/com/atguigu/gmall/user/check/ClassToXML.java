package com.atguigu.gmall.user.check;

import com.atguigu.gmall.user.Util.WxUtil;
import com.atguigu.gmall.user.entiy.*;
import com.thoughtworks.xstream.XStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.atguigu.gmall.user.contant.WeChatContant.MODEL_POST_SEND_TOKEN;

public class ClassToXML {


    private static String classToXml(BaseMessage bm) {
        XStream xStream = new XStream();
        xStream.processAnnotations(TextMessage.class);
        xStream.processAnnotations(ImageMessage.class);
        xStream.processAnnotations(MusicMessage.class);
        xStream.processAnnotations(NewsMessage.class);
        xStream.processAnnotations(VideoMessage.class);
        xStream.processAnnotations(VoiceMessage.class);
        System.out.println(bm.toString());
        String toXML = xStream.toXML(bm);
        return toXML;

    }

    public String dealTextMessage(Map<String, String> resultMap, String content) {
        TextMessage message = new TextMessage(resultMap, content);
        String s = classToXml(message);
        return s;
    }


    /*转换  转义字符  */
    public static String escapeCode(String s) {
        if (s.contains("&lt;")) {
            s = s.replace("&lt;", "<");//必须要重新赋值给一个字符串

        }
        if (s.contains("&gt;")) {
            s = s.replace("&gt;", ">");
        }
        return s;
    }

    /*处理文本或者  特定的字符串*/
    public String dealGetXML(Map<String, String> resultMap, String content) {

        /*图文消息的构造器  关键词 可在 dealGetXML 函数中进行编辑  对关键词进行分别的回复*/
        if (resultMap.get("Content").equals("册册")) {
            List<Article> arrayList = new ArrayList();
            Article article = new Article("<![CDATA[册册最可耐]]>", "<![CDATA[" + "啊册是不得了一个人" + "]]>", "<![CDATA[http://mmbiz.qpic.cn/mmbiz_jpg/zhZjGfyutiaAwibK8zWlYZLl6q0nuIf6wcyBmF5ALWxBzAjg7V4Ws5ClEIuTbBgj0SWHhQQKNMjrUxGq9xEfaPAg/0]]>", "<![CDATA[http://www.baidu.com]]>");
            arrayList.add(article);
            NewsMessage message = new NewsMessage(resultMap, arrayList);
            return classToXml(message);
        }if (resultMap.get("Content").equals("buy")){
            System.out.println("进入  resultMap.get  ==  buy函数中");
            CreatModel creatModel = new CreatModel();
            String buy = CreatModel.getModel("buy");
            System.out.println(buy);
            String url = GetToken.getIsPired();
            String access_token = WxUtil.post(MODEL_POST_SEND_TOKEN.replace("ACCESS_TOKEN",url), buy);
            System.out.println(access_token);
            return null;
        }
        else {
            String s = dealTextMessage(resultMap, content);
            return s;
        }

    }


    /*处理事件点击事件或者 关注等事件*/
    public static String dealGetXmlEvent(Map<String, String> resultMap) {
        String event = resultMap.get("Event");
        System.out.println("event----------->>>"+event);
        if (event.equals("CLICK")) {
            /*在处理  EventKey 里面的值 */
            String s = dealCLICK(resultMap);
            return s;
        }else if (event.equals("subscribe")){
            String s = dealSubscribe(resultMap);
            return s;
        }else if (event.equals("VIEW")) {
            return null;
        }
        else {
            return null;
        }

    }
    public static String dealSubscribe(Map<String, String> resultMap){
        TextMessage textMessage = new TextMessage(resultMap, "欢迎关注 找人儿 我们会给你提供最可靠的帮助,欢迎访问我们的网站www.xxxxx.com");
        return classToXml(textMessage);
    }

    public static String dealCLICK(Map<String, String> resultMap) {
        String eventKey = resultMap.get("EventKey");
        if (eventKey.equals("key")) {
            TextMessage textMessage = new TextMessage(resultMap, "你点击了一级菜单");
            return classToXml(textMessage);

        } else if (eventKey.equals("32")) {
            System.out.println("你点击了网易新闻");
            TextMessage textMessage = new TextMessage(resultMap, "你点击了网易新闻");
            return classToXml(textMessage);
        } else {
            return null;
        }
    }
}
