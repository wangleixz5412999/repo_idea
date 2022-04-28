package mapper;


import com.lagou.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户表(User)表数据库访问层
 *
 * @author wanglei
 * @since 2022-04-28 10:34:09
 */
@Service
public interface UserDao {

   User login(@Param("phone")String phone,@Param("password")String password);

}

