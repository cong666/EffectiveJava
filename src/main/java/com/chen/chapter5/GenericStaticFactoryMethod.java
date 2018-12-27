package com.chen.chapter5;

import java.util.HashMap;

/**
 * Created by: ccong
 * Date: 18/12/27 上午11:57
 */
public class GenericStaticFactoryMethod {
    public static <K,V> HashMap<K,V> newHashMap() {
        return new HashMap<>();
    }

    /*good*/
    public static <T> T getT(T t) {
        return t;
    }

    /*not good*/
    public static <T> T getTFromObject(Object o) {
        return (T)o;
    }

    public static void main(String args[]) {
        HashMap<Integer,String> map = newHashMap();
        map.put(1,"");

        //identify the return type by parameter
        //Integer i = getT("dd");//compiler error
        String s = getT("dd");

        String s1 = getTFromObject("o");
        //String s2 = getTFromObject(new Dog());//ClassCastException:Dog can not be cast to String
    }
}
