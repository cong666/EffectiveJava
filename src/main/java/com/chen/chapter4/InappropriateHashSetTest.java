package com.chen.chapter4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by: ccong
 * Date: 18/12/24 下午1:05
 */
public class InappropriateHashSetTest {
    public static void main(String args[]) {
        HashSet<Integer> inappropriateHashSet = new InappropriateHashSet();
        inappropriateHashSet.add(1);
        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        inappropriateHashSet.addAll(list);

        System.out.println(((InappropriateHashSet<Integer>) inappropriateHashSet).getCount());//output 7 not 4
    }
}
