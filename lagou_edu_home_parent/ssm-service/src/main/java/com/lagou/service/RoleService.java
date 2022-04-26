package com.lagou.service;

import java.util.List;

public interface RoleService {
    /*
    根据角色id，查询菜单id
     */
    List<String> findMenuByRoleId(Integer roleId);
}
