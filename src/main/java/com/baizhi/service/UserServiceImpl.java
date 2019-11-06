package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    //1.注册   添加数据
    @Override
    @Transactional
    public void inserts(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.inserts(user);
    }

    //2.批量删除
    @Override
    @Transactional
    public void deleteByIDs(String[] ids) {
        userDao.deleteByIDs(ids);
    }

    //3.修改
    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    //4.删除一个
    @Override
    @Transactional
    public void delete(String id) {
        userDao.delete(id);
    }

    //5.查询所有   展示所有
    @Override
    @Transactional
    public List<User> selectAll(Integer rows,Integer page) {
        List<User> list = userDao.selectAll(rows,page);
        return list;
    }

    @Override
    @Transactional
    public User selectOne() {
        User user = userDao.selectOne();
        return user;
    }

    @Override
    @Transactional
    public Integer sum() {
        Integer sum = userDao.sum();
        return sum;
    }
    //登录
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User login(String username,String password) {
        User user = userDao.selectlogin(username, password);
        return user;
    }
}
