package com.back.strategy;

public class CreditCardPayment implements PaymentStrategy{
    private final String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("신용카드(" + cardNumber + ")로 " + amount + "원 결제 완료되었습니다.");
    }
}
