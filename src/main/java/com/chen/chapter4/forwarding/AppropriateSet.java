package com.chen.chapter4.forwarding;

import java.util.Collection;
import java.util.Set;

/**
 * Created by: ccong
 * Date: 18/12/24 下午1:52
 */
public class AppropriateSet<E> extends ForwardingSet<E> {
    private int count = 0;
    public AppropriateSet(Set<E> set) {
        super(set);
    }

    public boolean add(E e) {
        count ++;
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        count = count + c.size();
        return super.addAll(c);
    }

    public int getCount() {
        return this.count;
    }
}
