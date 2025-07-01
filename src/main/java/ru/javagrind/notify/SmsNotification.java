package ru.javagrind.notify;


public class SmsNotification extends Notification{
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public SmsNotification(String message, String phoneNumber, Priority priority) {
        super(priority, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Отправляем SMS на " + getPhoneNumber());
        System.out.println("Приоритет: " + getPriority());
        System.out.println("Доставлено сообщение: " + getMessage() + "\n");

    }


}

