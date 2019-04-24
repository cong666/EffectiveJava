package com.chen.designpattern.proxy;

/**
 * Created by: ccong
 * Date: 19/4/24 下午4:07
 */
public class CarSpeedProxy implements Speed {
    private Speed speed;
    public CarSpeedProxy(Speed speed) {
        this.speed = speed;
    }
    @Override
    public void speed() {
        System.out.println("before speed");
        speed.speed();
        System.out.println("after speed");
    }
}
