package com.chen.designpattern.visitor;

/**
 * Created by: ccong
 * Date: 19/4/24 下午3:37
 */
public class Test {
    public static void main(String args[]) {
        ComputerComponent cc = new Mouse();

        ComputerVisitor initCV = new ComputerInitVisitor();
        ComputerVisitor displayCV = new ComputerDisplayVisitor();
        cc.accept(initCV);
        cc.accept(displayCV);
    }
}
