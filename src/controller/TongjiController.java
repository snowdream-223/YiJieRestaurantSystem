package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class TongjiController {
    @RequestMapping("/tongji.html")
    public String showtongji(HttpSession session) {
        if (session.getAttribute("user") == null) {//权限控制
            return "redirect:login.html";
        }
        return "tongji/tongji";
    }
}
