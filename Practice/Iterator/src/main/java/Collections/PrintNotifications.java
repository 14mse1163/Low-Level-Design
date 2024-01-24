package Collections;

import Iterator.Iterator;
import Iterator.NotificationIterator;

public class PrintNotifications {

    NotificationCollection notificationCollection;

    public PrintNotifications(NotificationCollection  notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotification() {
        Iterator itr = notificationCollection.createIterator();
        while (itr.hasNext()) {
            System.out.println(((Notification)itr.next()).getMessage());
        }
    }
}
