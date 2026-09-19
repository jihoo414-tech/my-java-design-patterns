package com.back.factoryMethod;

public class Main {
    public static void main(String[] args){
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailFactory.sendNotification();

        NotificationFactory smsFactory = new SmsNotificationFactory();
        Notification smsNotification = smsFactory.createNotification();
        smsFactory.sendNotification();

    }
}
