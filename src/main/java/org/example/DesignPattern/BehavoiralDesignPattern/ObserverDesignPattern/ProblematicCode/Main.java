package org.example.DesignPattern.BehavoiralDesignPattern.ObserverDesignPattern.ProblematicCode;

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
