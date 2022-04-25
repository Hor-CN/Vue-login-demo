package cn.itbk.loginwork.login.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * 用户表
 * @TableName user
 */
@Data
public class User {

    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    @JsonIgnore
    private String passwordMd5;


}