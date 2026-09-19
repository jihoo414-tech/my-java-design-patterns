package com.back.factoryMethod;

// ConcreteProduct 2: SMS 알림
public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("💬 [SMS] 문자 메시지 알림을 발송합니다.");
    }
}