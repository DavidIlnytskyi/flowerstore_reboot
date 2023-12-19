package com.example.demo.PaymentStrategy;

public class CreditCardPaymentStrategy implements Payment {
    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with credit card: " + cardNumber);
    }
}
