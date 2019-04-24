package com.chen.designpattern.builder.item;

/**
 * Created by: ccong
 * Date: 19/4/24 下午12:04
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 11.0f;
    }
}
