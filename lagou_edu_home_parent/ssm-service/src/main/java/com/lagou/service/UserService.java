package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.User;
import com.lagou.domain.UserVo;

import java.util.List;

public interface UserService {
    /*
    查询所有用户
     */
    public PageInfo findAllUserByPage(UserVo userVo);

    /*
    用户登录
     */
    public User login(User user) throws Exception;
}
