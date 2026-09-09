Interview in Walmart.

In amazon for any product if it is out of stock then there is a button called Notify Me. Whenever the product will be available then the customer who has clicked in the Notify Me button will get the message.

Implement the Notify Me button.

In observer design pattern we have 2 objects `Observable` and `Observer` 
Whe there is any state change in the Observable then it will update to all the Observer.
There are multiple Observer who is following the Observable.


First is `Observable Interface`. It has the method add (also known as registration used to add the observer name to the observable interface), remove and notify. 
Another `Observer` interface. it has the update method.

In the add method will add teh Observer.`add(Observer obj);`
Same for the remove will remove the Observer. `remove(Observer obj);`
In notify will send notify to the observer that are added and we store in the list. List contains the observer. `List<ObserverInterface>`

**When implements Interface, making concrete class of teh interface it is IS-A** and **when we use the interface for any list or anything then HAS-A**.

![img_1.png](observerDesignPattern.png)

The update method has no parameter.
One way where we pass the observable interface in the parameter in the ObservableConcreteClass and get the update in the ObserverConcreteClass and mention as an instance of the ObservableConcreteClass as there will be multiple concrete class for the observable.
Another way(HeadFirstDesignPattern) we pass the ObservableInterface in the constructor injection of the ObserverConcreteClass. Whenever there will be an update we can get the notify.

### Example.
Weather Station. It needs to update the current temperature every 5 mins. The weather is getting observed by `TVDisplayObserver` and `MobileDisplayObserver`
No use of observer pattern then the weather station would have to explicitly inform each device about the temperature change and tight coupling.

How to solve.

![img_1.png](observerDesignPatternExample1.png)

If we donot take the constructor Injection then we have to pass the object in the parameter and also we have to mention like instance of as TVObserver can look to weatherStationObservable and it can also watch to the CricketStationObservable. 

Now that we have the weatherStationObservable as the constructor injection so for every update the update method will be called.
```java
MobileDisplayObserver(WeatherStationObservable o){
this.obj = o;
}
```

When we need CricketStationObservable then will pass it in the constructor.


The problematic code.

```java
class WeatherStation{
    private float temperature;
    private DisplayDevice displayDevice;
    
    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }
    
    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyDevices();
    }
    public void notifyDevices() {
        displayDevice.update(temperature);
    }
}

class DisplayDevice{
    public void update(float temp) {
        System.out.println("Temperature updated to: " + temp);
    }
}

class Main{
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device); // It is making the device and new device needs to be added in the main method. It is tight coupling and new device is not track.
        
        station.setTemperature(25.0f);
        station.setTemperature(30.0f);
                
    }
}
```

The solution to use the Observer Interface and the WeatherStation will be the Observable and the DisplayDevice will be the Observer. 

The WeatherStation has the List<Observer> and the addObserver(), removeObserver() and notifyObservers() methods. 

There are ways where the add, remove and notify can be called as Subject abstract class and the WeatherStation is the concrete class.

