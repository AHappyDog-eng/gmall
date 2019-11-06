package com.atguigu.gmall.user.controller;
import com.atguigu.gmall.user.check.LoginCheck;
import com.atguigu.gmall.user.check.ReplyXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UserController {


    @GetMapping("wxchat")
    @ResponseBody
    public String getMemberById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*登录检查*/
        System.out.println("jinru wxchat");
        String logincheck = LoginCheck.Logincheck(request, response);
        return logincheck;

    }

    @PostMapping("wxchat")
    public String getDouckument(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("进入了 index 没有开始处理");
        String s = ReplyXml.getResponse(request, response, "你好");
        System.out.println("进入 index处理完成");
        System.out.println(s);
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        return s;
    }


}
