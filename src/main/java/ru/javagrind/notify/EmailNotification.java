package ru.javagrind.notify;

import java.util.ArrayList;

public class EmailNotification extends Notification{
    private String email;
    private String message;
    private Priority Priority;

    public String getEmail() {
        return email;
    }
    public String getMessage() {
        return message;
    }
    public Priority getPriority() {
        return Priority;
    }

    public EmailNotification(String message, String email, Priority Priority) {
        this.email = email;
        this.message = message;
        this.Priority = Priority;
    }

    @Override
    public void send() {
        System.out.println("Отправляем Email на " + getEmail());
        System.out.println("Приоритет: " + getPriority());
        System.out.println("Доставлено сообщение: " + message + "\n");
    }

}
