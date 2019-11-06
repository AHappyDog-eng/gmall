package com.atguigu.gmall.user.check;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class WxCheck {
    //    验证微信签名
    //    同步token
    private static final String TOKEN = "WeChat";

    public static final boolean ckeck(String timestamp, String nonce, String Signature) {


        //1）将token、timestamp、nonce三个参数进行字典序排序
        String[] sorting = new String[]{TOKEN, timestamp, nonce};
        Arrays.sort(sorting);
        //2）将三个参数字符串拼接成一个字符串进行sha1加密
        String encryption = sorting[0]+sorting[1]+sorting[2];
        String resource = sha1(encryption);
        //3）开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
        System.out.println("正在效验。。。。。。");
        System.out.println(Signature+resource);
        if (resource.equals(Signature)){
            return true;
        }
        else{
            return false;
        }
    }
    private static String sha1(String encryption) {

        /*获取加密算法*/
        try {
            MessageDigest sha1 = MessageDigest.getInstance("sha1");
            byte[] digest = sha1.digest(encryption.getBytes());
            char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            StringBuilder builder = new StringBuilder();
            for (byte b : digest
            ) {
                builder.append(chars[(b>>4) & 15]);
                builder.append(chars[b & 15]);
            }
            return builder.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("加密算法失败");
            return null;
        }
    }
}
