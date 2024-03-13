package pojo;

import service.deskstate.DeskstateService;

import java.util.List;

public class DeskandState {


    private Integer id;
    private String deskCode;
    private Integer status;
    private Integer peopleNum;
    private int foodstate;
    private List<DeskInfo_detail> deskInfo_details;

    public DeskandState(Integer id, String deskCode, Integer status, Integer peopleNum, int foodstate, List<DeskInfo_detail> deskInfo_details) {
        this.id = id;
        this.deskCode = deskCode;
        this.status = status;
        this.peopleNum = peopleNum;
        this.foodstate = foodstate;
        this.deskInfo_details = deskInfo_details;
    }

    public DeskandState(Integer id, String deskCode, Integer status, Integer peopleNum, int foodstate) {
        this.id = id;
        this.deskCode = deskCode;
        this.status = status;
        this.peopleNum = peopleNum;
        this.foodstate = foodstate;

    }

    public List<DeskInfo_detail> getDeskInfo_details() {
        return deskInfo_details;
    }

    public void setDeskInfo_details(List<DeskInfo_detail> deskInfo_details) {
        this.deskInfo_details = deskInfo_details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeskCode() {
        return deskCode;
    }

    public void setDeskCode(String deskCode) {
        this.deskCode = deskCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public int getFoodstate() {
        return foodstate;
    }

    public void setFoodstate(int foodstate) {
        this.foodstate = foodstate;
    }

}
