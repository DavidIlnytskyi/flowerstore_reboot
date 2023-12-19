package com.example.demo.Flower;

import java.util.List;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerBucket {
    private int price = 0;

    private List<FlowerPack> bucket = new ArrayList<>();

    public void add(FlowerPack pack){
        bucket.add(pack);
        price = price + pack.getPrice();
    }

    public int price(){
        return price;
    }
}
