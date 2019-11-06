package com.atguigu.gmall.user.check;

import com.atguigu.gmall.user.entiy.TextMessage;
import com.atguigu.gmall.user.entiy.TextRe;
import com.thoughtworks.xstream.XStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class ReplyXml {
    /*处理所有事件
     * 和消息的回复
     * 返回MXL数据包
     * */
    public static  String getResponse(HttpServletRequest request, HttpServletResponse response, String content) throws IOException {

        Map<String, String> resultMap = ParsXml.parseRequest(request.getInputStream());
        String msgType = (String) resultMap.get("MsgType");
        switch (msgType) {
            case "text":
                /*我希望有一个可以完成的xml 自动构造成功 并返回数值*/
                ClassToXML classToXML = new ClassToXML();
                String s = classToXML.dealGetXML(resultMap, content);
                String escapecode = classToXML.escapeCode(s);
                /*不让 他转义*/
                return escapecode;

            case "image":
                break;

            case "voice":
                break;

            case "video":
                break;

            case "shortvideo":
                break;
            case "location":
                break;
            case "link":
                break;
                /*event  为点击事件*/
            case "event":
                System.out.println("进入了 event选择器");
                String getXmlEvent = ClassToXML.dealGetXmlEvent(resultMap);
                String escapeCode = ClassToXML.escapeCode(getXmlEvent);
                return escapeCode;
            default:
                break;
        }
    return "";
    }




}
