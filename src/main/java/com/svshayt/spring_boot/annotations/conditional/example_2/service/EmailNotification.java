package com.svshayt.spring_boot.annotations.conditional.example_2.service;

public class EmailNotification implements NotificationSender {
    @Override
    public String send(String message) {
        return "Email Notification: " + message;
    }
}
