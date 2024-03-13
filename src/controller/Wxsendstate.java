package controller;

import dao.bill.DeskBillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.DeskInfo_detail;
import pojo.Deskbill;
import service.desk.DeskService;
import service.deskbill.DeskBillService;
import service.deskstate.DeskstateService;
import tools.RedisUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*
*changeDesk.do
*                     "id": id,
                    "peopleNum": peopleNum,
                    "status": 2*/
@Controller
public class Wxsendstate {
    @Autowired
    DeskstateService deskstateService;
    @Autowired
    DeskService deskService;
    @Autowired
    DeskBillMapper deskBillMapper;
    @Autowired
    RedisUtil redisUtil;

    @RequestMapping(value = "/wxstate", method = RequestMethod.GET)
    @ResponseBody
    public int pay1(@RequestParam String deskCode, @RequestParam int billid) {

        List<DeskInfo_detail> list = redisUtil.getList("foodlist" + deskCode);
        if (list != null) {

            for (DeskInfo_detail deskInfoDetail : list) {
                Integer deskBillId = deskInfoDetail.getDeskBillId();
                if (deskBillId == billid) {
                    return 0;

                }
            }
            return 1;

        }

        return 1;
    }


}
