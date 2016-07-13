package com.appshed.whatsfordinner.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john.toal on 7/11/16.
 */
public class DishList {
    private List<Dish> dishList;


    public DishList(){
        dishList = new ArrayList<>();
        createDishList();
    }

    public List<Dish> getDishList(){
        return dishList;
    }

    public void createDishList(){
        //Fetch updates from central list - update URLs and Fetch ingredients - measures

        dishList.add(new Dish("Spicy Italian Pasta"));
        dishList.add(new Dish("Spicy Fish Taccos"));
        dishList.add(new Dish("Sweet Chili Sweet Potato with Chicken"));
        dishList.add(new Dish("Spinach and Feta pie"));
        dishList.add(new Dish("Guinness and Beef pie"));
        dishList.add(new Dish("Steak and Baby Boileds"));
        dishList.add(new Dish("Pork Shoulder Burritos"));
        dishList.add(new Dish("Italian Pork and Mince Meatballs"));
        dishList.add(new Dish("Pizzas"));
        dishList.add( new Dish("Vegetable Soup"));
        dishList.add( new Dish("Mushroom Soup"));
        dishList.add( new Dish("Quinoa and Feta Salad"));
        dishList.add( new Dish("Fresh chicken salad"));
        dishList.add( new Dish("Roast Beef"));
        dishList.add( new Dish("Roast Chicken"));
        dishList.add( new Dish("Mixed Salad"));
        dishList.add( new Dish(""));
        dishList.add( new Dish(""));
        dishList.add( new Dish(""));
        dishList.add( new Dish(""));
        dishList.add( new Dish(""));
        dishList.add( new Dish(""));
        dishList.add( new Dish(""));




    }
}
