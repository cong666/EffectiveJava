package com.chen.designpattern.proxy;

/**
 * Created by: ccong
 * Date: 19/4/24 下午4:09
 */
public class Test {
    public static void main(String args[]) {
        Speed speed = new CarSpeed();
        speed.speed();
        Speed speedProxy = new CarSpeedProxy(speed);
        speedProxy.speed();
    }
}
