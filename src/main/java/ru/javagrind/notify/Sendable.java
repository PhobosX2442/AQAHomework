package ru.javagrind.notify;

import java.util.ArrayList;

public interface Sendable {
    public abstract void send();

    default void sendAll() {
        send(); {
            System.out.println("Отправляем сообщение на ...");
        }
    }


}


