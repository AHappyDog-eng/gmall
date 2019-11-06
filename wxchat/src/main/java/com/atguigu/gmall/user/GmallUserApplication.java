package com.atguigu.gmall.user;


import com.atguigu.gmall.user.check.CreatMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall.user.mapper")
public class GmallUserApplication {

    public static void main(String[] args) {
        CreatMenu.creatMenu();
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
