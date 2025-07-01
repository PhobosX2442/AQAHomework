package ru.javagrind.notify;


public class EmailNotification extends Notification{
    private String email;
    private String message;
    private Priority priority;

    public String getEmail() {
        return email;
    }




    public EmailNotification(String message, String email, Priority priority) {
        super(priority, message);
        this.email = email;

    }

    @Override
    public void send() {
        System.out.println("Отправляем Email на " + getEmail());
        System.out.println("Приоритет: " + getPriority());
        System.out.println("Доставлено сообщение: " + getMessage() + "\n");
    }

}
