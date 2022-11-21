package com.svshayt.spring_boot.annotations.conditional.example_2.service;

public class SmsNotification implements NotificationSender {

    @Override
    public String send(String message) {
        return "SMS notification: " + message;
    }
}
