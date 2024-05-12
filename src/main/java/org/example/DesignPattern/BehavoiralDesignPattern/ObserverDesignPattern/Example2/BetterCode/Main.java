package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode;

import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observable.IPhoneObservableImpl;
import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observable.StockObservable;
import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observer.EmailAlertObserverImpl;
import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observer.MessageAlertObserverImpl;
import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        // Making object of the Observable.
        StockObservable iPhoneObservable = new IPhoneObservableImpl();
        // First observer and asked for the iPhoneObservable via email.
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",iPhoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc1@gmail.com",iPhoneObservable);
        NotificationAlertObserver observer3 = new MessageAlertObserverImpl("SDEB",iPhoneObservable);

        iPhoneObservable.add(observer1);
        iPhoneObservable.add(observer2);
        iPhoneObservable.add(observer3);

        iPhoneObservable.setStockCount(10);
        // When we add more count then we will not get the update.
        // When we make the count 0 and then when we add some data then we will get the update.
    }
}
