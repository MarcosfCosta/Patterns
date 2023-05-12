package org.example;

import org.example.notification.MailNotification;
import org.example.notification.Notification;
import org.example.notification.NotificationFactory;
import org.example.notification.SMSNotification;
import org.example.notification.enums.NotificationTypeEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternApplication.class, args);
        
        Notification notificationMail = NotificationFactory.create(NotificationTypeEnum.MAIL);
        Notification notificationSMS = NotificationFactory.create(NotificationTypeEnum.SMS);

        notificationMail.push();
        notificationSMS.push();
    }
}
