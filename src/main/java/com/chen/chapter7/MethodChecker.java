package com.chen.chapter7;

/**
 * Created by: ccong
 * Date: 18/12/29 上午11:53
 */
public class MethodChecker {

    //add -ea in vm options to enable the assertion
    //use assert for debug mode not for production
    public int modulus(int a, int b) {
        assert a>b;
        assert a>0 && b>0;
        return a%b;
    }

    public static void main(String args[]) {
        MethodChecker mc = new MethodChecker();
        mc.modulus(-1,-2);
        System.out.println("end");
    }
}
