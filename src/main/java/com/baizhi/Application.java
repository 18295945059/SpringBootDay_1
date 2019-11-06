package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication   //开启SpringBoot应用
@MapperScan("com.baizhi.dao") //自动创建DAO实现类对象
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        //启动SpringBoot应用
        SpringApplication.run(Application.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
