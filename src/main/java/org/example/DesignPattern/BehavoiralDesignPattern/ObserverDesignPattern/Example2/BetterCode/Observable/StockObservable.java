package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observable;

import org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscriber();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
