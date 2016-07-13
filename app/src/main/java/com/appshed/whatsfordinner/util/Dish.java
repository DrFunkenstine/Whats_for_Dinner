package com.appshed.whatsfordinner.util;

import java.util.EnumSet;

/**
 * Created by john.toal on 7/11/16.
 */
public class Dish {
    private enum type{Meat,Pasta,Fish,Mexican,Spicy,Salad,Fresh,Chicken,Winter,Italian};
    private String name;
    private EnumSet<type> categories;
    public Dish(String name, EnumSet<type> categories){
        this.name = name;
        this.categories = categories;

    }
    public Dish(String name){
        this.name = name;
    }
    public void setCategories(EnumSet<type> categories){
        this.categories = categories;
    }
    public EnumSet<type> getCategories() {
        return categories;
    }
    public String getName(){
        return name;
    }
    public boolean isMeat(){
        return categories.contains(type.Meat);
    }
    public boolean isPasta(){
        return categories.contains(type.Pasta);
    }
    public boolean isFish(){
        return categories.contains(type.Fish);
    }
    public boolean isMexican(){
        return categories.contains(type.Mexican);
    }
    public boolean isSpicy(){
        return categories.contains(type.Spicy);
    }
    public boolean isSalad(){
        return categories.contains(type.Salad);
    }
    public boolean isFresh(){
    return categories.contains(type.Fresh);

    }
    public boolean isChicken(){
        return categories.contains(type.Chicken);
    }
    public boolean isWinter(){
        return categories.contains(type.Winter);
    }
    public boolean isItalian(){
        return categories.contains(type.Italian);
    }


}
