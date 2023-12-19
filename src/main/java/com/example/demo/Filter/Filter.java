package com.example.demo.Filter;

import com.example.demo.Order.Item;

public interface Filter {

    public boolean match(Item item);
}