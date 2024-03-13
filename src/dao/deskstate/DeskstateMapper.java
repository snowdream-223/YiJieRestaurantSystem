package dao.deskstate;

public interface DeskstateMapper {

    public void adddeskstate(String deskcode);

    public void updatedeskstate(String deskcode, int state);

    public void deldeskstateBydeskCode(String deskcode);

    public int getfoodstateBydeskcode(String deskcode);
}
