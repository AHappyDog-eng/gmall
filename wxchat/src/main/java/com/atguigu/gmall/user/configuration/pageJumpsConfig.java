package com.atguigu.gmall.user.configuration;

import com.atguigu.gmall.user.Interceptor.interceptor;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class pageJumpsConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/getlogin").setViewName("success");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/").setViewName("index");
        super.addViewControllers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*注册一个拦截器*/
        /*registry.addInterceptor(new interceptor()).addPathPatterns("/**").excludePathPatterns("/index","/login");*/
    }
}
