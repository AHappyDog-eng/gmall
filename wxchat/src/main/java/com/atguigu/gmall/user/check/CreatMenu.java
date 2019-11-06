package com.atguigu.gmall.user.check;

import com.atguigu.gmall.user.Util.WxUtil;
import com.atguigu.gmall.user.entiy.*;
import net.sf.json.JSONObject;

import static com.atguigu.gmall.user.contant.WeChatContant.TABLE_MENU_POST;

public class CreatMenu {
    public static void creatMenu(){
        String jsonButton = getJsonButton();
        String accessToken = GetToken.getIsPired();
        String url = TABLE_MENU_POST.replace("ACCESS_TOKEN",accessToken);
        String post = WxUtil.post(url, jsonButton);
    }
    public static String getJsonButton(){
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
        return jsonObject.toString();
    }
}
