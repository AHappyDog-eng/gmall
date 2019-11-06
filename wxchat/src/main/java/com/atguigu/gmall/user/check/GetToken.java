package com.atguigu.gmall.user.check;

import com.atguigu.gmall.user.Util.WxUtil;
import com.atguigu.gmall.user.entiy.WxToken;
import net.sf.json.JSONObject;


import static com.atguigu.gmall.user.contant.WeChatContant.APPKEY;
import static com.atguigu.gmall.user.contant.WeChatContant.APPSECRET;
import static com.atguigu.gmall.user.contant.WeChatContant.GET_TOKEN_URL;

public class GetToken {

    private static WxToken wxtoken;
    /*对外界封装保证 安全性能*/
    private static final void GetTokenMessage(){
        String gettokenurl=GET_TOKEN_URL.replace("APPID",APPKEY).replace("APPSECRET",APPSECRET);
        String s = WxUtil.get(gettokenurl);
        /*获取到之后  再解析进行存储*/
        JSONObject jsonObject = JSONObject.fromObject(s);
        String token = jsonObject.getString("access_token");
        String expires_in = jsonObject.getString("expires_in");
        wxtoken = new WxToken(token,expires_in);
        System.out.println(s);
    }

    /*给外界提供方法 可判断token是否过期*/
    public static  String getIsPired(){
        if (wxtoken==null || wxtoken.IsPiredTime())
        {
            GetTokenMessage();
        }
        return wxtoken.getToken();
    }
}
