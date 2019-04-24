package com.chen.designpattern.visitor;

/**
 * Created by: ccong
 * Date: 19/4/24 下午3:19
 */
public interface ComputerComponent {
    void accept(ComputerVisitor visitor);
}
