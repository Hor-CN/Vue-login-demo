package cn.itbk.loginwork.login.api.vo;

import cn.itbk.loginwork.login.domain.User;
import lombok.Data;

/**
 * @author Hor
 * @create 2022/4/24 16:21
 */
@Data
public class UserVo {
    private String token;
    private User user;
}
