package ru.javagrind.notify;
import java.util.*;


public interface Sendable {
    public abstract void send();

    static void sendAll(List<? extends Sendable> notifications) {
        System.out.println("Отправляем все уведомления");
        for (Sendable t : notifications) {
            t.send();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }

    default void sendWithLogging() {
        System.out.println("Начинаю sendWithLogging \n");
        this.send();
        System.out.println("Заканчиваю sendWithLogging \n");
        System.out.println("--------------------------------------");

    }
}


