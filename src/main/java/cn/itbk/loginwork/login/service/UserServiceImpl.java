package cn.itbk.loginwork.login.service;


import cn.itbk.loginwork.login.domain.User;
import cn.itbk.loginwork.login.exception.CustomException;
import cn.itbk.loginwork.login.mapper.UserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author Hor
 * @create 2022/4/23 15:55
 */
@Service
public class UserServiceImpl {

    @Resource
    private UserMapper userMapper;

    public User login(String userName, String passWord) {
        User user = userMapper.selectUserName(userName);
        if (user == null) {
            CustomException.fail("用户不存在");
        }
        if (!passWord.equals(user.getPasswordMd5())) {
            CustomException.fail("账号或密码不正确！");
        }
        return user;
    }


}
