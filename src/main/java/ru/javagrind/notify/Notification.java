package ru.javagrind.notify;

public abstract class Notification implements Sendable{
    private final int id;
    public boolean getId;
    private String message;
    private Priority priority;
    private static int nextId = 1;

    public String getMessage() {
        return message;
    }
    public Priority getPriority() {
        return priority;
    }
    public int getId() {
        return id;
    }

    public Notification(Priority priority, String message) {
        this.priority = priority;
        this.message = message;
        this.id = nextId++;
    }

    public Notification() {
        this(Priority.NORMAL, "empty");
    }


    public abstract void send();

    public void send(String extra) {
        System.out.println("Notification: " + message);
        System.out.println("extra");
    }

    @Override
    public String toString() {
        return "id: " + getId() + "\nПриоритет: " + getPriority() + "\nСообщение: " + getMessage() + "\n";
    }
}
