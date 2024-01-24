package org.example;

import Context.Document;
import Context.User;
import States.Draft;
import States.Moderation;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("admin");

        Document document = new Document(new Draft() , user);

        document.publish();
    }
}