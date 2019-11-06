package com.zhaoren.gmall.manage.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhaoren.gmall.bean.UserTest;
import com.zhaoren.gmall.service.serviceCatalogManage;

@Service
public class serviceCatalogManageImpl implements serviceCatalogManage {
    @Override
    public UserTest getCatalog1() {
        UserTest userTest = new UserTest("王宁","java");

        System.out.println("gmall-manage-service");
        return userTest;
    }
}
