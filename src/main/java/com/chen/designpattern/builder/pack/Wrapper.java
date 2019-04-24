package com.chen.designpattern.builder.pack;

/**
 * Created by: ccong
 * Date: 19/4/24 上午11:56
 */
public class Wrapper implements Packing {
    @Override
    public PackingType packing() {
        return PackingType.WRAPPER;
    }
}
