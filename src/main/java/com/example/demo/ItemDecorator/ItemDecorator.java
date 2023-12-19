package com.example.demo.ItemDecorator;


import com.example.demo.Order.Item;

abstract class ItemDecorator {
    public abstract double getPrice(Item item);
    public abstract String getDescription();
}
