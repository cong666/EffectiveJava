package com.chen.chapter4.forwarding;

import com.chen.chapter4.InappropriateHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by: ccong
 * Date: 18/12/24 下午1:05
 */
public class AppropriateHashSetTest {
    public static void main(String args[]) {
        Set<Integer> appropriateSet = new AppropriateSet<>(new HashSet<Integer>());
        appropriateSet.add(1);
        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        appropriateSet.addAll(list);

        System.out.println(((AppropriateSet<Integer>) appropriateSet).getCount());//4
    }
}
