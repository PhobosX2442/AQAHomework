package ru.javagrind.notify;
import java.util.*;



public class NotificationManager <T extends Notification> {

    private final List<T> list = new ArrayList<>();
    private final Map<Priority, List<Notification>> notificationsByPriority = new HashMap<>();

    public NotificationManager() {
        for (Priority priority : Priority.values()) {
            notificationsByPriority.put(priority, new ArrayList<>());
        }
    }

    //add
    public void add(Notification n) throws DuplicateIdException {
        for (Notification existing : list) {
            if (existing.getId() == n.getId()) {
                throw new DuplicateIdException("Уведомление с таким id уже существует: " + n.getId());
            }
        }
        list.add((T) n);

        Priority priority = n.getPriority();
        List<Notification> listForPriority = notificationsByPriority.get(priority);
        if (listForPriority == null) {
            listForPriority = new ArrayList<>();
            notificationsByPriority.put(priority, listForPriority);
        }
        listForPriority.add(n);
    }

    // find
    public Optional<Notification> find(int id) {
        for (Notification notification : list) {
            try {
                if (notification.getId() == id) {
                    return Optional.of(notification);
                }
            } catch (NumberFormatException e) {
                throw new DuplicateIdException("Уведомление с таким id уже существует: " + id);
            }

        }
        return Optional.empty();
    }


    // get
    public List<Notification> get(Priority priority) {
        List<Notification> originalList = notificationsByPriority.get(priority);
        if (originalList == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(originalList);
    }

    //sendAll
    public void sendAll() {
        System.out.println("Отправляем все уведомления");
        for (Notification notification : list) {
            notification.send();
        }
    }


}
