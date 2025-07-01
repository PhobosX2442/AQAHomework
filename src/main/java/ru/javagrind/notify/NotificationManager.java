package ru.javagrind.notify;
import java.util.*;



public class NotificationManager <T extends Notification> {

    private final List<T> list = new ArrayList<>();
    private final Map<Priority, List<T>> notificationsByPriority = new HashMap<>();

    public NotificationManager() {
        for (Priority priority : Priority.values()) {
            notificationsByPriority.put(priority, new ArrayList<>());
        }
    }

    //add
    public void add(T n) throws DuplicateIdException {
        for (T existing : list) {
            if (existing.getId() == n.getId()) {
                throw new DuplicateIdException("Уведомление с таким id уже существует: " + n.getId());
            }
        }
        list.add(n);

        Priority priority = n.getPriority();

        List<T> listForPriority = notificationsByPriority.computeIfAbsent(priority, k -> new ArrayList<>());
        listForPriority.add(n);
    }


    // find
    public Optional<T> find(int id) {
        return list.stream()
                .filter(notification -> notification.getId() == id)
                .findFirst();
    }


    // get
    public List<T> get(Priority priority) {
        List<T> originalList = notificationsByPriority.get(priority);
        return new ArrayList<>(originalList);
    }

    //sendAll
    public void sendAll() {
        System.out.println("Отправляем все уведомления");
        for (T notification : list) {
            notification.send();
        }
        System.out.println("-------------------------------------- \n");
    }

}
