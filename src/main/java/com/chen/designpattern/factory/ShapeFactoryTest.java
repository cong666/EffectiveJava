package com.chen.designpattern.factory;

/**
 * Created by: ccong
 * Date: 19/4/22 下午11:26
 */
public class ShapeFactoryTest {

    public static void main(String args[]) {
        Shape shape = ShapeFactory.createShape("com.chen.designpattern.factory.Circle");
        shape.draw();
    }
}
