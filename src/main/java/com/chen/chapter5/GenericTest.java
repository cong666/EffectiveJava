package com.chen.chapter5;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by: ccong
 * Date: 18/12/27 下午1:23
 */
public class GenericTest {

    public void doInsert(List<Object> list) {
        list.add(new Dog());
    }

    /**
     *
     * @param list can accept a list of all type
     */
    public void doInsert2(List<?> list) {
        //list.add(new Dog());//compiler error , can not add any thing
        for(Object o : list) {
            Dog dog = (Dog)o;
            System.out.println(dog.getName());
        }
    }

    /**
     *
     * @param list can accept a list of type which extends Animal
     */
    public void doInsert3(List<? extends Animal> list) {
        //list.add(new Dog());//compiler error, can not add any thing
        for(Animal d : list) {
            System.out.println(d.getName());
        }
    }

    /**
     *
     * @param list can accept a list of type which is Dog's super class
     */
    public void doInsert4(List<? super Dog> list) {
        list.add(new Dog());//can add dog
        for(Object o : list) {
            Dog d = (Dog)o;
            System.out.println(d.getName());
        }
    }

    public static void main(String args[]) {
        GenericTest gt = new GenericTest();
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        //gt.doInsert(dogs);//compiler error List<Object> 只接受List<Object>

        gt.doInsert2(dogs);//可以传递List<Dog> 给doInsert2 而不能传给doInsert

        gt.doInsert3(dogs);//can pass the dogs as parameter

        gt.doInsert4(dogs);//can pass the dogs as parameter
    }
}
