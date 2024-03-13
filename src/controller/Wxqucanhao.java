package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Desk;
import service.desk.DeskService;

@Controller
public class Wxqucanhao {
    @Autowired
    DeskService deskService;

    @RequestMapping(value = "/qucanhao", method = RequestMethod.GET)
    @ResponseBody
    public int qucan(@RequestParam String deskCode) {
        for (Desk desk : deskService.getDesks()) {
            if (desk.getDeskCode().equals(deskCode)) {
                return desk.getId();
            }
        }

        return 111111;
    }
}
