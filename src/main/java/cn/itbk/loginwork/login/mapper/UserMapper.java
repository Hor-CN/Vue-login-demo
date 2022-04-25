package cn.itbk.loginwork.login.mapper;

import cn.itbk.loginwork.login.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hor
 * @create 2022/4/23 15:41
 */
@Mapper
public interface UserMapper {

    /**
     *
     * @param userName 账号
     * @return User
     */
    User selectUserName(String userName);

}

