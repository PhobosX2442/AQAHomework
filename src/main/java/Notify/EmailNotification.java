package Notify;

public class EmailNotification extends Notification{
    private String email;

    public String getEmail() {
        return email;
    }

    public EmailNotification(String message, String email) {
        super(Priority.HIGH, message);
        this.email = email;
    }
    @Override
    public void send() {
        System.out.print("id: " + getId() + ", ");
        System.out.println("Приоритет: " + getPriority());
        System.out.println("Отправляем Email на " + getEmail());
        System.out.println("Сообщение: " + getMessage());
        System.out.println();

    }
}
