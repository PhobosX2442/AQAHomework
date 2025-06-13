package Notify;

public class Demo {

    static String message = "Тестовое сообщение";
    static Priority priority = Priority.NORMAL;
    static String email = "qqq@qq.qq";
    static String phoneNumber = "123123123";

    public static void main(String[] args) {

        Notification notification = new Notification(priority, message);
        Notification emailNotification = new EmailNotification(message, email);
        Notification smsNotification = new SmsNotification(message, phoneNumber);

        Notification[] notifications = {notification, emailNotification, smsNotification};

        for (Notification n : notifications) {
            n.send();
        }

        System.out.println("Количество уведомлений: " + notifications.length);

    }
}
