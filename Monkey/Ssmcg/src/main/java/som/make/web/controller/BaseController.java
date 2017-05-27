package som.make.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/19.
 */
@Controller
public class BaseController {
    @RequestMapping("/index")
    public String BaseIndex(){
        return "index";
    }
}
