package com.lagou.dao;

import java.util.List;

public interface RoleMapper {

    /*
    根据角色id，查询出所关联的菜单信息
     */
    List<String> findMenuByRoleId(Integer roleId);
}
