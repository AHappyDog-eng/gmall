package com.zhaoren.gmall.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhaoren.gmall.service.serviceMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebManagerController {
    @Reference
    serviceMapper mapper;
    @RequestMapping("/nihao")
    public String getById(){
        String byId = mapper.getById();
        System.out.println(byId);
        return byId;
    }
}
