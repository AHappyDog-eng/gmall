package com.zhaoren.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhaoren.gmall.bean.UserTest;
import com.zhaoren.gmall.service.serviceCatalogManage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 跨域 结局解决 办法
@CrossOrigin
public class CalalogManageController {
    @Reference
    serviceCatalogManage service;
    @RequestMapping("getCatalog1")
    @ResponseBody
    public UserTest getCatalog1(){
        UserTest catalog1 = service.getCatalog1();
        System.out.println("getCatalog1");
        return catalog1;
    }



}
