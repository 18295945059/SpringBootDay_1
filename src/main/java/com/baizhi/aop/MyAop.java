
package com.baizhi.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect//注明切面类
@Component//把改类交给Spring工厂管理
public class MyAop {

    @Before("execution(* com.baizhi.service..*.*(..))")
    public void aop1(){
        System.out.println("我是运行在原始方法之前执行的额外功能");
    }
}

