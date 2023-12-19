package com.example.demo.ItemDecorator;

import com.example.demo.Order.Item;

public class KibbOnDecorator extends ItemDecorator{
    public double getPrice(Item item){
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "You are using kibb-on decoration for flowers.";
    }
}
