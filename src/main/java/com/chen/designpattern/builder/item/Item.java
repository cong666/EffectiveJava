package com.chen.designpattern.builder.item;

import com.chen.designpattern.builder.pack.Packing;

/**
 * Created by: ccong
 * Date: 19/4/24 上午11:59
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
