package com.example.demo.ItemDecorator;

import com.example.demo.Order.Item;

public class BasketDecorator extends ItemDecorator{
    public double getPrice(Item item){
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "You are using basket decoration for flowers.";
    }
}
