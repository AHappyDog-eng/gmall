package com.atguigu.gmall.user.contant;

public class WeChatContant {
    //APPID
    public static final String appID = "appid";
    //appsecret
    public static final String appsecret = "appsecret";
    // Token
    public static final String TOKEN = "zch";
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";
    public static final Object REQ_MESSAGE_TYPE_TEXT = "text";
    public static final Object REQ_MESSAGE_TYPE_IMAGE = "image";
    public static final Object REQ_MESSAGE_TYPE_VOICE = "voice";
    public static final Object REQ_MESSAGE_TYPE_VIDEO = "video";
    public static final Object REQ_MESSAGE_TYPE_LOCATION = "location";
    public static final Object REQ_MESSAGE_TYPE_LINK = "link";
    public static final Object REQ_MESSAGE_TYPE_EVENT = "event";
    public static final Object EVENT_TYPE_SUBSCRIBE = "SUBSCRIBE";
    public static final Object EVENT_TYPE_UNSUBSCRIBE = "UNSUBSCRIBE";
    public static final Object EVENT_TYPE_SCAN = "SCAN";
    public static final Object EVENT_TYPE_LOCATION = "LOCATION";
    public static final Object EVENT_TYPE_CLICK = "CLICK";

    public static final String FromUserName = "FromUserName";
    public static final String ToUserName = "ToUserName";
    public static final String MsgType = "MsgType";
    public static final String Content = "Content";
    public static final String Event = "Event";
    public static final String GET_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    public static final String APPKEY = "wx46328a931bd1b656";
    public static final String APPSECRET = "b9111715bdfe754174a27d6d1fe07ad4";
    public static final String TABLE_MENU_POST = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    public static final String MODEL_POST_SEND_TOKEN = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
    public static final String MODEL_SEND_MODEL_ID = "XEQ7lfvTAN64CgtriGNR3COzXZw776Vkurl-0HfffW8";

}