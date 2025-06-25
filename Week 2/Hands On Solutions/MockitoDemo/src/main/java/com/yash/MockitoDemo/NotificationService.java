package com.yash.MockitoDemo;

public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String userName) {
        String msg = "Hello " + userName + ", you have a new alert!";
        //=== TO VERIFY THIS FUNCTION ===
        notifier.send(msg);
    }
}
