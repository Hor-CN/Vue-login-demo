package cn.itbk.loginwork.login.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Hor
 * @create 2022/4/24 17:36
 */
@Controller
public class IndexAPI {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("/index.html");
    }


}
