package com.example.demo.Delivery;

class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivered via DHL.");
    }
}