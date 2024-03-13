package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Weixin {
    @RequestMapping(value = "/islogin", method = RequestMethod.GET)
    @ResponseBody
    public String dd(@RequestParam(value = "usercode", defaultValue = "worde") String usercode) {
        System.out.println("获得的用户id为" + usercode);


        return "登录成功";
    }

}
