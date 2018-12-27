package com.chen.chapter4;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by: ccong
 * Date: 18/12/24 下午12:59
 */
public class InappropriateHashSet<E> extends HashSet<E> {
    private int count = 0;

    public InappropriateHashSet() {
        super();
    }

    @Override
    public boolean add(E e) {
        count++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        count = count+c.size();
        return super.addAll(c);
    }

    public int getCount() {
        return this.count;
    }
}
