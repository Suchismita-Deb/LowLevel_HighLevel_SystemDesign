package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observable;

import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example2.BetterCode.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> list = new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver i:list){
            i.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0){
            // If the stock count is 0 then update to the notifier that stock count increases.
            // The setStockCount will be only called when there is an update in the value.
            // When it is called and if stockCount==0 then call notify.
            notifySubscriber();
        }
        stockCount+=newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
