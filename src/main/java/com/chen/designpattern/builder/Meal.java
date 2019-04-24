package com.chen.designpattern.builder;

import com.chen.designpattern.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: ccong
 * Date: 19/4/24 下午12:14
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void listItem() {
        for(Item item : items) {
            System.out.println(item);
        }
    }

    public float getTotalPrice() {
        float total = 0f;
        for(Item item : items) {
            total+=item.price();
        }
        return total;
    }
}
