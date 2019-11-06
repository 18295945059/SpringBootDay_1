package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    //1.展示所有
    @RequestMapping("/show")
    @ResponseBody
    public Map<String,Object> showAll(Integer rows, Integer page) throws Exception{
        System.out.println(rows);
        System.out.println(page);
        HashMap<String, Object> map = new HashMap<>();
        //总条数
        Integer sum = userService.sum();
        //总页数
        Integer pageCount=sum%rows==0?sum/rows:sum/rows+1;
        System.out.println(pageCount);
        System.out.println(sum);
        //当前页数据
        List<User> users = userService.selectAll(rows, page);
        for (User user : users) {
            System.out.println(user);
        }
        map.put("total",pageCount);//yeshu
        map.put("records",sum);//zong tiaoshu
        map.put("page",page);//dangqianye
        map.put("rows",users);
        System.out.println(map);
        return map;
    }
    //增删改方法           //接收操作标识
    @RequestMapping("/edit")
    @ResponseBody
    public  void    edit(String oper,User user) throws  Exception{
        if ("add".equals(oper)){
            //调用添加员工的Service
            userService.inserts(user);
            System.out.println("----------------------------------"+user);
        }else  if ("edit".equals(oper)){
            //调用修改员工的Service
            userService.update(user);
        }else  if ("del".equals(oper)){
            //调用删除的Service
            userService.delete(user.getId());
        }
    }
    //登录
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session) throws Exception{
        User login = userService.login(username, password);
        if (login!=null){
            session.setAttribute("loginuser",login);
            return "index";
        }else {
            return "login";
        }

    }
}
