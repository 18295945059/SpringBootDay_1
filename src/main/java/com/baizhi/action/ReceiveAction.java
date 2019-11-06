package com.baizhi.action;

import com.baizhi.entity.User2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/receive")
public class ReceiveAction {

    @RequestMapping("/r1")
    public String r1(HttpServletRequest request) throws Exception{
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name);
        System.out.println(age);
        return "index";
    }

    @RequestMapping("/r2")
    public String r2(String name,String age) throws Exception{
        System.out.println(name);
        System.out.println(age);
        return "index";
    }

    @RequestMapping("/r3")
    public String r3(User2 u2)throws Exception{
        System.out.println(u2);
        return "index";
    }
    @RequestMapping("/r4")
    public String r4(Integer[] hobby){
        for (Integer integer : hobby) {
            System.out.println(integer);
        }
        return "index";
    }

}
