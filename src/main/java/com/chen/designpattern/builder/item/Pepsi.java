package com.chen.designpattern.builder.item;

/**
 * Created by: ccong
 * Date: 19/4/24 下午12:06
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.5f;
    }
}
