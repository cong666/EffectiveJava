package com.chen.designpattern.builder.item;

/**
 * Created by: ccong
 * Date: 19/4/24 下午12:04
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 13.0f;
    }

}
