package Notify;

public class SmsNotification extends Notification{
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SmsNotification(String message, String phoneNumber) {
        super(Priority.LOW, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.print("id: " + getId() + ", ");
        System.out.println("Приоритет: " + getPriority());
        System.out.println("Отправляем SMS на " + getPhoneNumber());
        System.out.println("Сообщение: " + getMessage());
        System.out.println();

    }
}
