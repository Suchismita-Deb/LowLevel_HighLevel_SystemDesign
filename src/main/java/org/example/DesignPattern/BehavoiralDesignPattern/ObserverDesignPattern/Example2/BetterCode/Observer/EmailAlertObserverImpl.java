package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observer;

import org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String email;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String email, StockObservable obj){
        this.email = email;
        this.stockObservable = obj;
    }

    @Override
    public void update() {
        System.out.println("Mail send to "+email+" Product is now available.");
    }
}
