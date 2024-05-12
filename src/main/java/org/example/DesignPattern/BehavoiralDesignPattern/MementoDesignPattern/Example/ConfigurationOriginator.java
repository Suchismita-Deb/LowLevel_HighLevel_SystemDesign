package org.example.DesignPattern.BehavoiralDesignPattern.MementoDesignPattern.Example;

// Originator
public class ConfigurationOriginator {
    int height;
    int width;

    ConfigurationOriginator(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    public void setWidth(int newWidth){
        this.width = newWidth;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height,this.width);
    }
    public void restoreMemento(ConfigurationMemento toBeRestored){
        this.height = toBeRestored.height;
        this.width = toBeRestored.width;
    }
}
