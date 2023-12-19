package com.example.demo.ItemDecorator;

import com.example.demo.Order.Item;

public class PaperDecorator extends ItemDecorator{
    public double getPrice(Item item){
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "You are using paper decoration for flowers.";
    }
}
