package com.lagou.user.service;

import com.lagou.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2022-04-28 10:34:19
 */
public interface UserService {

  User login(String phone,String password);

}
