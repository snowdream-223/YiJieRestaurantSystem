package service.dish;

import dao.dishwx.Dishwxmapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Dishwximpl implements Dishwx {
    @Resource
    private Dishwxmapper dishwxmapper;


    @Override
    public pojo.Dishwx getfooddesc(Integer id) {
        return dishwxmapper.getfooddesc(id);
    }
}
