package com.lagou.dao;

import com.lagou.domain.User;
import com.lagou.domain.UserVo;
import java.util.List;

public interface UserMapper {
    /*
    查询所y有用户
     */
    public List<User> findAllUserByPage(UserVo userVo);

    /*
    用户登录
     */
    public User login(User user);
    
     public User login2(User user);
}
