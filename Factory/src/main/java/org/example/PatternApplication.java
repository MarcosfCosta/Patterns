package org.example;

import org.example.notification.MailNotification;
import org.example.notification.NotificationFactory;
import org.example.notification.SMSNotification;
import org.example.notification.enums.NotificationTypeEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternApplication.class, args);

        MailNotification mailNotification = (MailNotification) NotificationFactory.create(NotificationTypeEnum.MAIL);

        SMSNotification smsNotification = (SMSNotification) NotificationFactory.create(NotificationTypeEnum.SMS);

        mailNotification.push();
        smsNotification.push();
    }
}
