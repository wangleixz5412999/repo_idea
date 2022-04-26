package com.lagou.service.impl;

import com.lagou.dao.RoleMapper;
import com.lagou.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wanglei
 * @create:2022-04-25-17:29
 * @Description:角色相关信息
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<String> findMenuByRoleId(Integer roleId) {
        List<String> menuByRoleId = roleMapper.findMenuByRoleId(roleId);
        return menuByRoleId;
    }
}
