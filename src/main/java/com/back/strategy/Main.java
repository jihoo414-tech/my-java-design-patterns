package com.back.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("자바 디자인 패턴 책", 30000);
        cart.addItem("개발자 키보드", 150000);

        // 1. 신용카드로 결제 전략 선택
        cart.checkout(new CreditCardPayment("1234-5678-9012-3456"));

        System.out.println("\n--------------------------------");

        // 2. 다른 장바구니 생성 후 카카오페이 결제 전략 선택
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem("모니터", 250000);

        cart2.checkout(new KakaoPayPayment("user@kakao.com"));

        // 3. 자바 8+ 람다식을 이용한 즉석 전략 적용도 가능합니다!
        System.out.println("\n--------------------------------");
        cart2.checkout(amount -> System.out.println("포인트로 " + amount + "원 전액 결제 완료되었습니다."));
    }
}