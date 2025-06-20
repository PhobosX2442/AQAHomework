package ru.javagrind.notify;

import java.util.ArrayList;

public class SmsNotification extends Notification{
    private String phoneNumber;
    private String message;
    private Priority Priority;


    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getMessage() {
        return message;
    }
    public Priority getPriority() {
        return Priority;
    }


    public SmsNotification(String message, String phoneNumber, Priority Priority) {
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.Priority = Priority;

    }

    @Override
    public void send() {
        System.out.println("Отправляем SMS на " + getPhoneNumber());
        System.out.println("Приоритет: " + getPriority());
        System.out.println("Доставлено сообщение: " + message + "\n");

    }


}

