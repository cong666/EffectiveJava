package com.chen.designpattern.factory;

/**
 * Created by: ccong
 * Date: 19/4/22 下午11:24
 */
public class ShapeFactory {

    public static Shape createShape(String shape) {
        try {
            return (Shape)Class.forName(shape).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
