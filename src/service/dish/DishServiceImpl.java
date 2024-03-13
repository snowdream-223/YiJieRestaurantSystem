package service.dish;

import java.util.List;

import dao.dishwx.Dishwxmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.dish.DishMapper;

import pojo.Dish;

@Service
public class DishServiceImpl implements DishService {
    @Autowired
    private DishMapper dishMapper;
    @Autowired
    private Dishwxmapper dishwxmapper;

    @Override
    public List<Dish> getDish() {
        return dishMapper.getDish();
    }

    @Override
    public Dish getDishById(String id) {
        // TODO Auto-generated method stub
        return dishMapper.getDishById(id);
    }

    @Override
    public boolean addDish(Dish dish) {
        dishMapper.reset();
        if (dishMapper.addDish(dish) == 0) {


            return false;
        }
        return true;
    }

    @Override
    public boolean addDish(Dish dish, String dishdesc) {
        if (dishMapper.addDish(dish) == 0) {


            return false;
        }
        return true;
    }

    @Override
    public boolean isExist(String dishName) {
        if (dishMapper.isExist(dishName) == 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delDishById(String id) {
        if (dishMapper.delDishById(id) == 0) {

            return false;
        }
        dishwxmapper.delfooddesc(Integer.parseInt(id));
        return true;
    }
}
