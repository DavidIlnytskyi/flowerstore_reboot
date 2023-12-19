package com.example.demo.Order;

import java.util.List;

import com.example.demo.Delivery.Delivery;
import com.example.demo.PaymentStrategy.Payment;

public class Order {
    private List<Item> items;
    private Payment paymentStrategy;
    private Delivery deliveryStrategy;

    public Order(List<Item> items, Payment paymentStrategy, Delivery deliveryStrategy) {
        this.items = items;
        this.paymentStrategy = paymentStrategy;
        this.deliveryStrategy = deliveryStrategy;
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void processOrder() {
        double total = calculateTotal();
        paymentStrategy.pay(total);
        deliveryStrategy.deliver();
    }

    public void addItem(Item newItem) {
        items.add(newItem);
    }

    public void removeItem(Item itemToRemove) {
        items.remove(itemToRemove);
    }
}
