package org.example;

import Collections.NotificationCollection;
import Collections.PrintNotifications;

public class Main {
    public static void main(String[] args) {

        NotificationCollection list = new NotificationCollection();
        list.addMessage("Hello");
        list.addMessage("Welcome");
        list.addMessage("see you");

        PrintNotifications printNotifications = new PrintNotifications(list);
        printNotifications.printNotification();
    }
}