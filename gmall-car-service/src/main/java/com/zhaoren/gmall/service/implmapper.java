package com.zhaoren.gmall.service;

import com.alibaba.dubbo.config.annotation.Service;


/*  对方法进行 RPC服务 用 dubbo的service服务 进行扫描 */
@Service
public class implmapper implements serviceMapper {
    @Override
    public String getById() {
        return "调用了 gmall-car-service 接口函数";
    }
}
