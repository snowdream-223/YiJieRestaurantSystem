package dao.dishwx;

import pojo.Dishwx;

import java.util.List;

public interface Dishwxmapper {
    public Dishwx getfooddesc(Integer id);

    public void addfooddesc(String dishdesc, int id);

    public void delfooddesc(int id);

    public void reset();
}
