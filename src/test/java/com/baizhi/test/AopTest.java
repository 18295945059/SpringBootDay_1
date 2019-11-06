package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.service.AAopImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //开启SpringBoot的测试
@SpringBootTest(classes = Application.class) //初始化相关配置
public class AopTest {

    @Autowired
    private AAopImpl aAop;

    @Test
    public void test1(){
        aAop.select();
    }
}
