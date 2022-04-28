package user;

import com.lagou.entity.User;
import mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

/**
 * @author:wanglei
 * @create:2022-04-28-13:02
 * @Description:测试user
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"}) //上下文
public class TestUser {
    @Autowired
    private UserDao userDao;
    @Test
    public void login(){
        User login = userDao.login("1101", "123");
        System.out.println(login);

    }
}
