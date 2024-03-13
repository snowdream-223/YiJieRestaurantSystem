package pojo.wx;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


public class Food {


    private Integer id;
    private String foodimagesrc;
    private String foodname;
    private Double singlefoodmoney;
    private String fooddesc;
    private Integer selectnum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodimagesrc() {
        return foodimagesrc;
    }

    public void setFoodimagesrc(String foodimagesrc) {
        this.foodimagesrc = foodimagesrc;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public Double getSinglefoodmoney() {
        return singlefoodmoney;
    }

    public void setSinglefoodmoney(Double singlefoodmoney) {
        this.singlefoodmoney = singlefoodmoney;
    }

    public String getFooddesc() {
        return fooddesc;
    }

    public void setFooddesc(String fooddesc) {
        this.fooddesc = fooddesc;
    }

    public Integer getSelectnum() {
        return selectnum;
    }

    public void setSelectnum(Integer selectnum) {
        this.selectnum = selectnum;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodimagesrc='" + foodimagesrc + '\'' +
                ", foodname='" + foodname + '\'' +
                ", singlefoodmoney=" + singlefoodmoney +
                ", fooddesc='" + fooddesc + '\'' +
                ", selectnum=" + selectnum +
                '}';
    }
}
