package com.back.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<String> items = new ArrayList<>();
    private int totalAmount = 0;

    public void addItem(String name, int price){
        items.add(name);
        totalAmount += price;
        System.out.println("장바구니 추가: " + name + " (" + price + "원)");
    }

    //어떤 전략으로 결제를 진행할 지 런타임에 결정함.
    public void checkout(PaymentStrategy paymentStrategy){
        if (totalAmount == 0) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        System.out.println("\n--- 결제 진행 (총 " + totalAmount + "원) ---");
        paymentStrategy.pay(totalAmount);
    }

}
