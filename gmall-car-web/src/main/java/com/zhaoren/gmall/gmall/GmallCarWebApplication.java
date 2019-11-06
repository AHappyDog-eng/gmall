package com.zhaoren.gmall.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class GmallCarWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCarWebApplication.class, args);
    }

}
