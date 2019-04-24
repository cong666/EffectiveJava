package com.chen.designpattern.builder;

import com.chen.designpattern.builder.item.ChickenBurger;
import com.chen.designpattern.builder.item.Coke;

import java.awt.*;

/**
 * Created by: ccong
 * Date: 19/4/24 下午1:39
 */
public class Test {
    public static void main(String args[]) {
        Meal meal = new MenuBuilder().builderBurger(new ChickenBurger()).builderColdDrink(new Coke()).buildMenu();
        meal.listItem();
    }
}
