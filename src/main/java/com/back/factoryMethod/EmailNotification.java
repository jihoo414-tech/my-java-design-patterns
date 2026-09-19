package com.back.factoryMethod;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser(){
        System.out.println("[Email] 이메일 알림을 발송합니다.");
    }
}
