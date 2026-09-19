package com.back.factoryMethod;

public class Main {
    public static void main(String[] args){
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.sendNotification();

        NotificationFactory smsFactory = new SmsNotificationFactory();
        smsFactory.sendNotification();

    }
}
