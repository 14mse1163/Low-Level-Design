package Collections;

import Iterator.*;

public class NotificationCollection implements  Iterable{
    Notification[] notifications;
    int maxSize = 5;
    int pos = 0;
    public NotificationCollection() {
        notifications = new Notification[5];
    }

    public void addMessage(String msg) {

        if(pos >= 5) {
            System.err.println("Overflow");
        }
        notifications[pos] = new Notification(msg);
        pos++;

    }
    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}
