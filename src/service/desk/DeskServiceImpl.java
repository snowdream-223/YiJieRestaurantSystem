package service.desk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.desk.DeskMapper;

import pojo.Desk;
import pojo.DeskPager;
import service.deskstate.DeskstateService;

@Service
public class DeskServiceImpl implements DeskService {
    @Autowired
    private DeskstateService deskstateService;
    @Autowired
    private DeskMapper deskMapper;

    @Override
    public List<Desk> getDesks() {
        return deskMapper.getDesks();
    }

    @Override
    public boolean updateDeskStatus(Desk desk) {
        if (deskMapper.updateDeskStatus(desk) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateDesk(Desk desk) {

        if (deskMapper.updateDesk(desk) == 1) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Desk getDeskById(String id) {
        return deskMapper.getDeskById(id);
    }

    @Override
    public boolean isExist(String deskCode) {
        return deskMapper.isExist(deskCode) >= 1 ? true : false;
    }

    @Override
    public boolean addDesk(Desk desk) {
        deskMapper.reset();
        deskstateService.adddeskstate(desk.getDeskCode());
        return deskMapper.addDesk(desk) == 1 ? true : false;
    }

    @Override
    public List<Desk> getDesksByPager(DeskPager pager) {
        return deskMapper.getDesksByPager(pager);
    }

    @Override
    public int getTotalCount(DeskPager pager) {
        return deskMapper.getTotalCount(pager);
    }

    @Override
    public int delDesk(String id) {
        Desk deskById = deskMapper.getDeskById(id);
        deskstateService.deldeskstateBydeskCode(deskById.getDeskCode());
        return deskMapper.delDesk(id);
    }
}
