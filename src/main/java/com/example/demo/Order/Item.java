package com.example.demo.Order;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}