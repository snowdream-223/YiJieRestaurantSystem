package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Dish;
import pojo.wx.Food;
import service.wx.Foodservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Wxsendfoodlist {
    @Autowired
    Foodservice foodservice;


    @RequestMapping(value = "/isload", method = RequestMethod.GET)
    @ResponseBody
    public List<Food> sendfoodlist() {


        return foodservice.getfoodlist();
    }

}
