package org.example.LowLevelDesignSystemExample.DesignLinkedin.src.observer;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.src.entities.Notification;

public interface NotificationObserver {
    void update(Notification notification);
}
