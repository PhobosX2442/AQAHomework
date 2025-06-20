package ru.javagrind.notify;

public class Demo {

    public static void main(String[] args) {

        String message = "Тестовое сообщение";
        Priority priority = Priority.NORMAL;
        String email = "qqq@qq.qq";
        String phoneNumber = "123123123";

        //Notification notification = new Notification(priority, message);
        Notification emailNotification = new EmailNotification(message, email, priority);
        Notification smsNotification = new SmsNotification(message, phoneNumber, priority);

        //Notification[] notifications = {notification, emailNotification, smsNotification};
        Notification[] notifications = {emailNotification, smsNotification};


        for (Notification n : notifications) {
            n.send();
        }

        System.out.println("Количество уведомлений: " + notifications.length);

    }
}
