package com.atguigu.gmall.user;

import com.atguigu.gmall.user.check.ClassToXML;
import com.atguigu.gmall.user.check.CreatModel;
import com.atguigu.gmall.user.check.GetToken;
import com.atguigu.gmall.user.entiy.*;
import net.sf.json.JSONObject;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class Text {
    @Test
    public void get() {

        Map<String, String> map = new HashMap<>();
        map.put("ToUserName", "to");
        map.put("FromUserName", "from");
        map.put("MsgType", "other");

        ClassToXML classToXML = new ClassToXML();
        String s = classToXML.dealGetXML(map, "nihaoma???" +
                "zzzz");
        System.out.println(s);


    }
    @Test
    public void getJsonButton(){
        Button button = new Button();
        /*两个一级菜单附属到  button上*/
        button.getButton().add(new ClickButton("一级菜单","key"));
        button.getButton().add(new ViewButton("跳转菜单","http://www.baidu.com"));
        /*
        * 单独构造一个 有二级菜单的菜单
        * */
        SubButton subButton = new SubButton("有子菜单");
        subButton.getSub_button().add(new PhotoOrAlbumButton("Photo","photokey"));
        subButton.getSub_button().add(new ClickButton("网易新闻","32"));
        subButton.getSub_button().add(new ViewButton("英雄联盟","https://lol.qq.com/act/a20190920worlds/index.shtml?e_code=491407&idataid=278057"));
        /*将创建的单独的菜单 附属到button上*/
        button.getButton().add(subButton);
        JSONObject jsonObject = JSONObject.fromObject(button);
        System.out.println(jsonObject.toString());
    }
    @Test
    public void getToken(){
        System.out.println(GetToken.getIsPired());
        System.out.println(GetToken.getIsPired());
    }
    @Test
    public void getjson(){

    }
}
