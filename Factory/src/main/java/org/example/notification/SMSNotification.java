package org.example.notification;

import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements Notification{

    public void push() {
        System.out.println("wild SMS Notification appear");
    }
}
