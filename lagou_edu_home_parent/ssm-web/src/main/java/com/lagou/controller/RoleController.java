package com.lagou.controller;

import com.lagou.domain.Menu;
import com.lagou.domain.ResponseResult;
import com.lagou.service.MenuService;
import com.lagou.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:wanglei
 * @create:2022-04-25-16:56
 * @Description:角色controller
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private RoleService roleService;
    /*
    查询所有菜单信息
     */
    @RequestMapping("/findAllMenu")
    public ResponseResult findAllMenu(){
        List<Menu> subMenuListByPid = menuService.findSubMenuListByPid(-1);

        //为什么要在这里加一个map
        //为了符合前台的需求，转换成json格式
        Map<String,Object> map = new HashMap<>();
        map.put("parentMenuList",subMenuListByPid);

        ResponseResult result = new ResponseResult(true,200,"响应成功",map);
        return result;
    }

    /*
    查询角色关联的菜单信息
     */
    @RequestMapping("/findMenuByRoleId")
    public ResponseResult findMenuByRoleId(Integer roleId){
        List<String> menuByRoleId = roleService.findMenuByRoleId(roleId);
        ResponseResult result = new ResponseResult(true,200,"响应成功",menuByRoleId);
        return result;
    }
}
