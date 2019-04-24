package com.chen.designpattern.builder.item;

/**
 * Created by: ccong
 * Date: 19/4/24 下午12:06
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
