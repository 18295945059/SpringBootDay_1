package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //添加
    public void inserts(User user);
    //批量删除
    public void deleteByIDs(String[] ids);
    //修改
    public void update(User user);
    //删除一个
    public void delete(String id);
    //查询所有
    public List<User> selectAll(@Param("rows") Integer rows, @Param("page") Integer page);
    //用过ID查询一个
    public User selectOne();
    //查询总条数
    public Integer sum();
    //登录查询一个
    public User selectlogin(@Param("username") String username,@Param("password") String password);
}
