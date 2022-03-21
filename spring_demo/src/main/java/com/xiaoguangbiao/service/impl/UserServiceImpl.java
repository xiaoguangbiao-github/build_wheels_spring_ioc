package com.xiaoguangbiao.service.impl;

import com.xiaoguangbiao.dao.UserDao;
import com.xiaoguangbiao.service.UserService;

/**
 * @version v1.0
 * @ClassName: UserServiceImpl
 * @Description: 业务逻辑层实现类
 * @Author: xiaoguangbiao
 */
public class UserServiceImpl implements UserService {

    //声明一个UserDao类型的变量
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("userService被创建了");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("UserService ...");
        userDao.add();
    }
}
