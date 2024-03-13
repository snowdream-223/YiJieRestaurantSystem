package service.wx;

import dao.dishwx.Dishwxmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Dish;
import pojo.wx.Food;
import service.dish.DishService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service

public class Foodserviceimpl implements Foodservice {
    @Autowired
    private DishService dishService;
    @Autowired
    private Dishwxmapper dishwxmapper;
    private Food food;

    public List<Food> getfoodlist() {
        List<Food> foodlist = new ArrayList<>();
        for (Dish dish : dishService.getDish()) {
            food = new Food();
            food.setFoodname(dish.getDishName());
            food.setId(dish.getId());
            food.setSinglefoodmoney(dish.getPrice());
//
//            System.out.println(  "得到dishid"+dish.getId());

            food.setFooddesc(dishwxmapper.getfooddesc(dish.getId()).getFooddesc());
            food.setFoodimagesrc(dish.getFileName());
            food.setSelectnum(0);
//            System.out.println("得到的food为"+food.toString());

            foodlist.add(food);
        }


        return foodlist;
    }
}
