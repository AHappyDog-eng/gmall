package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.exception.UserNotExitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
    @RequestMapping("/userlogin")
    public String getUser(String username){

        System.out.println(username);
       return null;
    }
    @RequestMapping("/login")
    public String UserNotExit(@RequestParam("user") String user){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.info(user.toString());
        System.out.println(user);
        if(user.equals("error")){
            throw new UserNotExitException();
        };
        return null;
    }
}
