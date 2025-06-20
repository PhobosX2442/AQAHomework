package ru.javagrind.notify;

import java.util.ArrayList;

public class SmsNotification extends Notification{
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SmsNotification(String message, String phoneNumber, Priority Priority) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Отправляем SMS на ...");

    }


}

