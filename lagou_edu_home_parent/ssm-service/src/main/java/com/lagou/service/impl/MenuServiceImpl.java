package com.lagou.service.impl;

import com.lagou.dao.MenuMapper;
import com.lagou.domain.Menu;
import com.lagou.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wanglei
 * @create:2022-04-25-16:54
 * @Description:菜单实现类
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> findSubMenuListByPid(int pid) {
        List<Menu> subMenuListByPid = menuMapper.findSubMenuListByPid(pid);
        return subMenuListByPid;
    }
}
