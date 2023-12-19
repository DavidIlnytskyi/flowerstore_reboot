package com.example.demo.Flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {

    private int amount;
    private Flower flower;
    private int price;

    public FlowerPack(Flower flower, int amount){
        this.amount = amount;
        this.flower = flower;
        this.price = flower.getPrice() * amount;
    }
}
