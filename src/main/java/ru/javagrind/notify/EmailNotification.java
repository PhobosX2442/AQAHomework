package ru.javagrind.notify;

import java.util.ArrayList;

public class EmailNotification extends Notification{
    private String email;

    public String getEmail() {
        return email;
    }

    public EmailNotification(String message, String email, Priority Priority) {
        this.email = email;
    }

    @Override
    public void send() {
        System.out.println("Отправляем Email на ...");
    }

}
