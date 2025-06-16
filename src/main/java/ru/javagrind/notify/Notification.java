package ru.javagrind.notify;

public class Notification {
    private final int id;
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


    public void send() {
//        System.out.print("id: " + getId() + ", ");
//        System.out.println("Приоритет: " + getPriority());
//        System.out.println("Сообщение: " + getMessage());
//        System.out.println();

        System.out.println(this);

    }

    public void send(String extra) {
        System.out.println("Notification: " + message);
        System.out.println("extra");
    }

    @Override
    public String toString() {
        return "id: " + getId() + "\nПриоритет: " + getPriority() + "\nСообщение: " + getMessage() + "\n";
    }
}
