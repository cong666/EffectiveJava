package com.chen.designpattern.visitor;

/**
 * Created by: ccong
 * Date: 19/4/24 下午3:27
 */
public class Computer implements ComputerComponent {
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
