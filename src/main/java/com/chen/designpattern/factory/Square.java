package com.chen.designpattern.factory;

/**
 * Created by: ccong
 * Date: 19/4/22 下午11:20
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square!");
    }
}
