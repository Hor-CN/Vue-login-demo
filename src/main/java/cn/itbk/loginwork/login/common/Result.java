package cn.itbk.loginwork.login.common;

import lombok.Data;

/**
 * @author Hor
 * @create 2022/4/23 16:06
 */
@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;



    public static Result<Object> success(int code, String msg, Object data) {
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    public static Result error(int code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
