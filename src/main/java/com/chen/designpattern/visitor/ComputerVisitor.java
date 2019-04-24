package com.chen.designpattern.visitor;

/**
 * Created by: ccong
 * Date: 19/4/24 下午3:23
 */
public interface ComputerVisitor {
    void visit(Computer c);
    void visit(Mouse m);
    void visit(Keyboard k);
}
