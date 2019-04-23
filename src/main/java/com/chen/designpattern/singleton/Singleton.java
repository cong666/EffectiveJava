package com.chen.designpattern.singleton;


/**
 * Created by: ccong
 * Date: 19/4/23 下午9:10
 */
public class Singleton {

    private enum SingletonBuilder {
        INSTANCE;

        private Singleton singleton;
        //this method is executed only one time
        SingletonBuilder() {
            singleton = new Singleton();
        }
        public Singleton getSingleton() {
            return singleton;
        }
    }

    public static Singleton getInstance() {
        return SingletonBuilder.INSTANCE.getSingleton();
    }
}
