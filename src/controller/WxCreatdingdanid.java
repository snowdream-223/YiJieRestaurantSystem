package controller;

import dao.bill.DeskBillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WxCreatdingdanid {
    @Autowired
    public DeskBillMapper deskBillMapper;

    @RequestMapping(value = "/creatdingdanid", method = RequestMethod.GET)
    @ResponseBody
    public long creatdingdanidlong() {


        return (long) deskBillMapper.getnewdeskbillid() + 1;
    }


}
