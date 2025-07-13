package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observer;

import org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observable.StockObservable;

public class MessageAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StockObservable stockObservable;

    public MessageAlertObserverImpl(String userName, StockObservable obj){
        this.userName = userName;
        this.stockObservable = obj;
    }

    @Override
    public void update() {
        System.out.println("Mail send to "+userName+" Product is now available.");
    }
}
