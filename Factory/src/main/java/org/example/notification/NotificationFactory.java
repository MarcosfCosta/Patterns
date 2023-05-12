package org.example.notification;

import org.example.notification.enums.NotificationTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class NotificationFactory {

    private static Map<NotificationTypeEnum, Notification> notifications;
    private MailNotification mailNotification;
    private SMSNotification smsNotification;

    @Autowired
    private NotificationFactory(MailNotification mailNotification, SMSNotification smsNotification) {
        this.notifications = new HashMap<NotificationTypeEnum, Notification>() {{ }};
        this.mailNotification = mailNotification;
        this.smsNotification = smsNotification;
    }

    @PostConstruct
    public void initFactory() {
        notifications.put(NotificationTypeEnum.SMS, smsNotification);
        notifications.put(NotificationTypeEnum.MAIL, mailNotification);
    }

    /**
     * Return the notification type implementation
     * @param type
     * @return
     */
    public static Notification create(NotificationTypeEnum type) {
        return notifications.get(type);
    }
}
