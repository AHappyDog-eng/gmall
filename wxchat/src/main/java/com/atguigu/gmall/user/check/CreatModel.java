package com.atguigu.gmall.user.check;


import com.atguigu.gmall.user.entiy.*;
import net.sf.json.JSONObject;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

import static com.atguigu.gmall.user.contant.WeChatContant.MODEL_SEND_MODEL_ID;

public class CreatModel {
    public static final String getModel(String model){
        if (model.equals("buy")){
            String str = "{\n" +
                    "           \"touser\":\"oL59EwhzOt6OegKilM6KJoz1w3RI\",\n" +
                    "           \"template_id\":\"XEQ7lfvTAN64CgtriGNR3COzXZw776Vkurl-0HfffW8\",\n" +
                    "           \"data\":{\n" +
                    "                   \"first\": {\n" +
                    "                       \"value\":\"恭喜你购买成功！\",\n" +
                    "                       \"color\":\"#173177\"\n" +
                    "                   },\n" +
                    "                   \"keyword1\":{\n" +
                    "                       \"value\":\"巧克力\",\n" +
                    "                       \"color\":\"#173177\"\n" +
                    "                   },\n" +
                    "                   \"keyword2\": {\n" +
                    "                       \"value\":\"39.8元\",\n" +
                    "                       \"color\":\"#173177\"\n" +
                    "                   },\n" +
                    "                   \"keyword3\": {\n" +
                    "                       \"value\":\"2014年9月22日\",\n" +
                    "                       \"color\":\"#173177\"\n" +
                    "                   },\n" +
                    "                   \"keyword4\": {\n" +
                    "                       \"value\":\"zz\",\n" +
                    "                       \"color\":\"#173177\"\n" +
                    "                   },\n"+
                    "                   \"remark\":{\n" +
                    "                       \"value\":\"欢迎再次购买！\",\n" +
                    "                       \"color\":\"#173177\"\n" +
                    "                   }\n" +
                    "           }\n" +
                    "       }";
        return str;
        }else{
            return null;
        }

    }
}
