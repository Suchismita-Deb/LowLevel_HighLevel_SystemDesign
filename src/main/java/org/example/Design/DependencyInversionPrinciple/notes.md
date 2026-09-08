Class should depend on interface rather than concrete classes.

Using interface and constructor injection.

High level module should not depend on low-level module and both should depend on abstraction.

In the notificationService code.
In the problematic code.
```java
public class NotificationService {

    private EmailService emailService;
    private SmsNotification smsNotification;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsNotification = new SmsNotification();
    }
    public void notifyEmail(String message){
        emailService.send(message);
    }
    
    public void notifySms(String message){
        System.out.println(message);
    }
}
```

The NotificationService is high level module and it is dependent on the low level module.

The WhatsApp service should be added in the notification service. Its not a perfect design. The NotificationServcie should depend on the abstraction and not on the concrete class.
The correct way to make the NotificationService.

```java
public class NotificationService {

    private final NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void sendNotification() {
        notificationChannel.sendNotification("Hello");
    }
}
```

The main class will call the notification interface.

```java
public static void main(String[] args) {
    NotificationService emailNotification = new NotificationService(new EmailService());
    emailNotification.sendNotification();
}
```

The main is dependent on the interface and not on the concrete class.

