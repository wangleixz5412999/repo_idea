package com.lagou.user.service.impl;

import com.lagou.entity.User;
import com.lagou.user.service.UserService;
import mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;


/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2022-04-28 10:34:20
 */
@Controller
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User login(String phone, String password) {
        User user = userDao.login(phone, password);
        return user;
    }
}
