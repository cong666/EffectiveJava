package com.chen.designpattern.visitor;

/**
 * Created by: ccong
 * Date: 19/4/24 下午3:29
 */
public class ComputerInitVisitor implements ComputerVisitor {
    @Override
    public void visit(Computer c) {
        System.out.println("init computer");
    }

    @Override
    public void visit(Mouse m) {
        System.out.println("init mouse");
    }

    @Override
    public void visit(Keyboard k) {
        System.out.println("init keyboard");
    }
}
