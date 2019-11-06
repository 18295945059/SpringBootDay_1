package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class) //开启SpringBoot的测试
@SpringBootTest(classes = Application.class) //初始化相关配置
public class UserTest {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    //1.添加
    /*@Test
    public void test1(){
       // userDao.inserts(new User("2","邢劲大","59421","18295945059","59421@qq.com","192.168.0.22","普通用户","业务系统2","激活"));
    }
    //2.批量删除
    @Test
    public void test2(){
       // String[] ids = {"3","4","5"};
        //userDao.deleteByIDs(ids);
    }
    //3.修改
    @Test
    public void test3(){
       // User user = new User("2", "邢劲大", "5942100", "18295945059", "59421@qq.com", "192.168.0.33", "普通用户", "业务系统2", "激活");
        //userDao.update(user);
    }*/

    @Test
    public void test4(){
        /*User user = new User("邢劲大", "5942100", "18295945059", "59421@qq.com", "192.168.0.33", "普通用户", "业务系统2", "激活");
        userService.inserts(user);*/
        for (int i=1;i<=10 ;i++){
            List<User> list = userService.selectAll(10, 1);
            for (User user : list) {
                System.out.println("----"+user);
            }
        }

    }
}
