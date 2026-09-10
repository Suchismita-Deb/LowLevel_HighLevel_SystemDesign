package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode3;

public class StateMain {
    public static void main(String[] args) {
        DirectionService service = new DirectionService(new Car());
        System.out.println(service.getETA());

        System.out.println(service.getETA());
    }
}

class DirectionService{
    // It will hold the reference of the State.
    private TransportationMode mode;
    DirectionService(TransportationMode mode) {
        this.mode = mode;
    }
    public void setMode(TransportationMode mode) {
        this.mode = mode;
    }

    // The calETA is given to the concrete class.
    public int getETA() {
        return mode.calETA();
    }
    public String getDirection() {
        return mode.getDirection();
    }
}


// A common state interface.
interface TransportationMode{
    int calETA();
    String getDirection();
}



class Car implements TransportationMode{
    @Override
    public int calETA() {
        System.out.println("Calculating ETA for Car");
        return 20;
    }

    @Override
    public String getDirection() {
        return "Direction for Car";
    }
}


class CyclingCar implements TransportationMode{
    @Override
    public int calETA() {
        System.out.println("Calculating ETA for CyclingCar");
        return 30;
    }
    @Override
    public String getDirection() {
        return "Direction for CyclingCar";
    }
}