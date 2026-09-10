package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.ProblematicCode;

public class NoStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.WALKING);
        System.out.println("ETA: " + directionService.getETA());
        System.out.println("Direction: " + directionService.getDirection());

        directionService.setMode(TransportationMode.CAR);
        System.out.println("ETA: " + directionService.getETA());
        System.out.println("Direction: " + directionService.getDirection());
    }
}
class DirectionService{
    // The state will be stored in the enum and in a variable.
    private TransportationMode mode;
    public DirectionService(TransportationMode transportationMode){
        this.mode = transportationMode;
    }
    // The initial mode is set and the application will change the mode so there is a setter mode.
    public void setMode(TransportationMode transportationMode){
        this.mode = transportationMode;
    }
    // There is a calculation to get the ETA based on the Transportation mode.
    public int getETA() {
        switch (mode){
            case WALKING:
                System.out.println("Calculating ETA for walking...");
                return 10;
            case CYCLING:
                System.out.println("Calculating ETA for cycling...");
                return 5;
            case CAR:
                System.out.println("Calculating ETA for car...");
                return 2;
            case TRAIN:
                System.out.println("Calculating ETA for train...");
                return 1;
            default:
                throw new IllegalArgumentException("Unknown transportation mode: " + mode);
        }
    }

    public String getDirection(){
        switch (mode){
            case WALKING:
                System.out.println("Getting direction for walking...");
                return "W";
            case CYCLING:
                System.out.println("Getting direction for cycling...");
                return "C";
            case CAR:
                System.out.println("Getting direction for car...");
                return "C";
            case TRAIN:
                System.out.println("Getting direction for train...");
                return "T";
            default:
                return "No direction available";
        }
    }
}
enum TransportationMode{
    WALKING, CYCLING, CAR, TRAIN
}