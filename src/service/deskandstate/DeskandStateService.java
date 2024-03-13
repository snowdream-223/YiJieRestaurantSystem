package service.deskandstate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Desk;
import pojo.DeskInfo_detail;
import pojo.DeskandState;
import service.deskstate.DeskstateService;
import tools.RedisUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service

public class DeskandStateService {
    @Autowired
    private DeskstateService deskstateService;
    @Resource(name = "redisUtil")
    private RedisUtil redisUtil;

    public List<DeskandState> getlist(List<Desk> deskList) {

        List<DeskandState> deskandStates = new ArrayList<>();
        for (Desk desk : deskList) {
            List<DeskInfo_detail> list = redisUtil.getList("foodlist" + desk.getDeskCode());
            if (list != null) {
                DeskandState deskandState = new DeskandState(desk.getId(), desk.getDeskCode(), desk.getStatus(), desk.getPeopleNum(), deskstateService.getfoodstateBydeskcode(desk.getDeskCode()), list);
                deskandStates.add(deskandState);
            } else {
                DeskandState deskandState = new DeskandState(desk.getId(), desk.getDeskCode(), desk.getStatus(), desk.getPeopleNum(), deskstateService.getfoodstateBydeskcode(desk.getDeskCode()));
                deskandStates.add(deskandState);
            }


        }
        return deskandStates;


    }

}
