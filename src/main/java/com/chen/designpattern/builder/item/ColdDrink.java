package com.chen.designpattern.builder.item;

import com.chen.designpattern.builder.pack.Bottle;
import com.chen.designpattern.builder.pack.Packing;

/**
 * Created by: ccong
 * Date: 19/4/24 下午12:02
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public String toString() {
        return "ColdDrink{" +
                "Name:"+name()+
                ",Packing:"+packing()+
                ",Price : "+price()+
                "}";
    }
}
