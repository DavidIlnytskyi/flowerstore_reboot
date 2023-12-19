package com.example.demo.Flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower{
    private int price;
    private FlowerColor color;
    private int sepalLength;
    private String name;

    public String getColor(){
        return color.getColor();
    }

    public Flower(String name, int price, FlowerColor color){
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getDescription(){
        return  String.format("Name: %s, price: %s, color %s", name, price, color);
    }
}