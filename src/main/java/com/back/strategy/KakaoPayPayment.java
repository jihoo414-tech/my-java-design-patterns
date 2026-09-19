package com.back.strategy;

// 2. 카카오페이 결제 전략
public class KakaoPayPayment implements PaymentStrategy {
    private final String email;

    public KakaoPayPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("카카오페이 계정(" + email + ")으로 " + amount + "원 결제 완료되었습니다.");
    }
}
