package com.chen.chapter9;

/**
 * Created by: ccong
 * Date: 18/12/30 上午12:11
 */
public class NotNormal {
    public static void main(String args[]) {
        int[] a = new int[]{1,2};
        int i=0;
        try {
            while (true) {
                System.out.println(a[i++]);
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
