package cn.itbk.loginwork.login.api;

import cn.dev33.satoken.stp.StpUtil;
import cn.itbk.loginwork.login.api.vo.UserVo;
import cn.itbk.loginwork.login.common.Result;
import cn.itbk.loginwork.login.domain.User;
import cn.itbk.loginwork.login.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Hor
 * @create 2022/4/24 16:19
 */
@RestController
@RequestMapping("/api")
public class LoginAPI {
    @Resource
    private UserServiceImpl userService;

    @PostMapping("/login")
    public Result<?> login(@RequestParam String username, @RequestParam String password){
        User user = userService.login(username, password);
        StpUtil.login(user.getId());
        UserVo userVo = new UserVo();
        userVo.setToken(StpUtil.getTokenValue());
        userVo.setUser(user);
        return  Result.success(200,"登录成功",userVo);
    }

}
