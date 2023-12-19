package com.example.demo.Filter;

import com.example.demo.Order.Item;

public class PriceFilter implements Filter {
    private final double minPrice;
    private final double maxPrice;

    public PriceFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public boolean match(Item item) {
        return minPrice <= item.getPrice() && maxPrice >= item.getPrice();
}}
