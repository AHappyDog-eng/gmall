package com.atguigu.gmall.user.check;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginCheck {
    public static final String Logincheck(HttpServletRequest request, HttpServletResponse response){
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        boolean ckeck = WxCheck.ckeck(timestamp, nonce, signature);
        if (ckeck != false) {
            System.out.println("验证成功");
            return echostr;
        } else {
            System.out.println("验证失败");
            return "error";
        }
    }
}
