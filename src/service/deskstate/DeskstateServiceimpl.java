package service.deskstate;

import dao.deskstate.DeskstateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeskstateServiceimpl implements DeskstateService {
    @Autowired
    private DeskstateMapper deskstateMapper;

    @Override
    public void adddeskstate(String deskcode) {
        deskstateMapper.adddeskstate(deskcode);
    }

    @Override
    public void updatedeskstate(String deskcode, int state) {
        deskstateMapper.updatedeskstate(deskcode, state);

    }

    @Override
    public void deldeskstateBydeskCode(String deskcode) {
        deskstateMapper.deldeskstateBydeskCode(deskcode);
    }

    @Override
    public int getfoodstateBydeskcode(String deskcode) {
        return deskstateMapper.getfoodstateBydeskcode(deskcode);
    }
}
