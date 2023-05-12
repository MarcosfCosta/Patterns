package org.example.notification;

import org.springframework.stereotype.Component;

@Component
public class MailNotification implements Notification {

    public void push() {
        System.out.println("wild Mail Notification appear");
    }
}
