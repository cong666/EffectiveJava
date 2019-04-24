package com.chen.designpattern.builder;

import com.chen.designpattern.builder.item.Burger;
import com.chen.designpattern.builder.item.ColdDrink;

/**
 * Created by: ccong
 * Date: 19/4/24 下午12:14
 * MenuBuilder create buger X 1 and colddrink X 1
 */
public class MenuBuilder {

    private Burger buger;
    private ColdDrink coldDrink;

    public MenuBuilder() {
    }

    public MenuBuilder builderBurger(Burger burger) {
        this.buger = burger;
        return this;
    }

    public MenuBuilder builderColdDrink(ColdDrink coldDrink) {
        this.coldDrink = coldDrink;
        return this;
    }

    public Meal buildMenu() {
        Meal menuMeal = new Meal();
        menuMeal.addItem(this.buger);
        menuMeal.addItem(this.coldDrink);
        return menuMeal;
    }
}
