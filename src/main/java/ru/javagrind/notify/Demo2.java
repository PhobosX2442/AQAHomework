package ru.javagrind.notify;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        NotificationManager<Notification> manager = new NotificationManager<>();

        //Уведомления
        Notification emailNotif1 = new EmailNotification("тест сообщение 1", "qqq@qq.qq", Priority.HIGH);
        Notification smsNotif1 = new SmsNotification("тест сообщение 2", "8 800 555 3535", Priority.HIGH);
        Notification emailNotif2 = new EmailNotification("тест сообщение 3", "kukareku@qq.qq", Priority.NORMAL);
        Notification smsNotif2 = new SmsNotification("тест сообщение 4", "1 234 567 8900", Priority.LOW);

        try {
            manager.add(emailNotif1);
            manager.add(smsNotif1);
            manager.add(emailNotif2);
            manager.add(smsNotif2);
            //дубль
            manager.add(emailNotif1);
        } catch (DuplicateIdException e) {
            System.out.println("Обнаружен дубликат: " + e.getMessage());
        }

        //get.HIGH
        System.out.println("Уведомления с приоритетом HIGH:");
        List<Notification> highPriorityNotifications = manager.get(Priority.HIGH);
        highPriorityNotifications.forEach(System.out::println);
        System.out.println("Конец уведомлений с приоритетом HIGH \n");

        //Поиск по id
        int idToFind = 11;
        Optional<Notification> notifOpt = manager.find(idToFind);
        notifOpt.ifPresentOrElse(
                Notification::send,
                () -> System.out.println("Уведомление с id " + idToFind + " не найдено. \n")
        );

        //sendAll
        manager.sendAll();

    }
}
