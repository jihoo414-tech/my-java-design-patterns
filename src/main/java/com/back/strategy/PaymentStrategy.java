package com.back.strategy;

@FunctionalInterface
public interface PaymentStrategy {
    void pay(int amount);
}
