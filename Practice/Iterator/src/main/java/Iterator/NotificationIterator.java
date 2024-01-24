package Iterator;

import Collections.Notification;
import Collections.NotificationCollection;

public class NotificationIterator implements Iterator
{

    Notification[] notifications ;
    int pos = 0;
    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }
    @Override
    public boolean hasNext() {
        if(pos >= notifications.length || notifications[pos] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        pos++;
        return notifications[pos-1];
    }
}
