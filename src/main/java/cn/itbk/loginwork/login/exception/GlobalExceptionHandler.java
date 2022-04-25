package cn.itbk.loginwork.login.exception;

import cn.itbk.loginwork.login.common.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Hor
 * @create 2022/4/24 16:04
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CustomException.class)
    @ResponseBody//返回json串
    public Result<?> customer(CustomException e) {
        return Result.error(400,e.getMassage());
    }


}
