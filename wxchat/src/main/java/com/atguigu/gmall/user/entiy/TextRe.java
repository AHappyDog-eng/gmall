package com.atguigu.gmall.user.entiy;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.io.OutputFormat;

import java.util.Map;

public class TextRe {

    private String ToUserName;
    private String FromUserName;
    private String CreateTime;
    private String MsgType;
    private String Content;

    @Override
    public String toString() {
        return "TextRe{" +
                "ToUserName='" + ToUserName + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", CreateTime='" + CreateTime + '\'' +
                ", MsgType='" + MsgType + '\'' +
                ", Content='" + Content + '\'' +
                '}';
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public TextRe() {
    }

    public TextRe(String toUserName, String fromUserName, String createTime, String msgType, String content) {
        ToUserName = toUserName;
        FromUserName = fromUserName;
        CreateTime = createTime;
        MsgType = msgType;
        Content = content;
    }

    public String ReValue(Map<String ,String> resoultMap, String Content){

        this.Content=Content;
        this.FromUserName=resoultMap.get("ToUserName");
        this.ToUserName = resoultMap.get("FromUserName");
        this.CreateTime = System.currentTimeMillis()/1000+"";
        this.MsgType="text";
        @SuppressWarnings("unckecked")
        String str = "<xml>" +
                "<ToUserName><![CDATA["+ToUserName+"]]></ToUserName>" +
                "<FromUserName><![CDATA["+FromUserName+"]]></FromUserName>" +
                "<CreateTime><![CDATA["+CreateTime+"]]></CreateTime>" +
                "<MsgType><![CDATA["+MsgType+"]]></MsgType>" +
                "<Content><![CDATA["+Content+"]]></Content>" +
                "</xml>";
        return str;

    }
}
