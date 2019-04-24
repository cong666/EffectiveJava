package com.chen.designpattern.proxy;

/**
 * Created by: ccong
 * Date: 19/4/24 下午4:01
 */
public class CarSpeed implements Speed {
    @Override
    public void speed() {
        System.out.println("car speed!");
    }
}
