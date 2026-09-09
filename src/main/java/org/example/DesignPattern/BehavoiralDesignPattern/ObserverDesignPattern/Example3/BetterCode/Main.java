package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.Example3.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double priceChangeThreshold = 10.0; // threshold in %
        StockMarket stockMarket = new StockMarket(priceChangeThreshold);

        InvestorA investorA = new InvestorA();
        InvestorB investorB = new InvestorB();

        // Register both observers
        stockMarket.registerObserver(investorA);
        stockMarket.registerObserver(investorB);

        // Hard-coded updates
        stockMarket.setStockPrice("AAPL", 110, 100);   // 10% change → notify both
        stockMarket.setStockPrice("GOOG", 210, 200);   // 5% change → no notification
        stockMarket.setStockPrice("MSFT", 330, 300);   // 10% change → notify both
        stockMarket.setStockPrice("TSLA", 440, 400);   // 10% change → notify both

        // Remove InvestorB after 4th update
        stockMarket.removeObserver(investorB);

        // 5th update → only InvestorA notified
        stockMarket.setStockPrice("AMZN", 550, 500);   // 10% change → notify A only
    }
}

// Subject implementation
class StockMarket implements Subject {
    private final List<Observer> observers;
    private final double priceChangeThreshold;

    public StockMarket(double priceChangeThreshold) {
        observers = new ArrayList<>();
        this.priceChangeThreshold = priceChangeThreshold;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String stockSymbol, double newPrice) {
        for (Observer observer : observers) {
            observer.update(stockSymbol, newPrice);
        }
    }

    public void setStockPrice(String stockSymbol, double newPrice, double oldPrice) {
        double priceChange = Math.abs(newPrice - oldPrice) / oldPrice * 100;
        if (priceChange >= priceChangeThreshold) {
            notifyObservers(stockSymbol, newPrice);
        }
    }
}

// Observers
class InvestorA implements Observer {
    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("Investor A notified: Stock " + stockSymbol + " has a new price: $" + newPrice);
    }
}

class InvestorB implements Observer {
    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("Investor B notified: Stock " + stockSymbol + " has a new price: $" + newPrice);
    }
}

// Interfaces
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String stockSymbol, double newPrice);
}

interface Observer {
    void update(String stockSymbol, double newPrice);
}
