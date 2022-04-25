package cn.itbk.loginwork.login.exception;

/**
 * @author Hor
 * @create 2022/4/24 16:11
 */
public class CustomException extends RuntimeException  {

    private String massage;

    public CustomException(String massage) {
        this.massage = massage;
    }


    public String getMassage() {
        return massage;
    }

    public static void fail(String massage) {
        throw new CustomException(massage);
    }

}
