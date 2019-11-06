package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class JSPAction {

    @RequestMapping("/jsp")
    public String jsp() throws Exception{
        System.out.println("我是第一个jsp");
        return "index";
    }

    @RequestMapping("/A")
    public String A() throws Exception{
        System.out.println("A方法");
        return "forward:/first/B";
    }
    @RequestMapping("/B")
    public String B() throws Exception{
        System.out.println("B方法");
        return "index";
    }
}
