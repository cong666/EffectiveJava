package com.chen.designpattern.builder.item;

import com.chen.designpattern.builder.pack.Packing;
import com.chen.designpattern.builder.pack.Wrapper;

/**
 * Created by: ccong
 * Date: 19/4/24 下午12:01
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public String toString() {
        return "Burger{" +
                "Name:"+name()+
                ",Packing:"+packing()+
                ",Price : "+price()+
                "}";
    }
}
