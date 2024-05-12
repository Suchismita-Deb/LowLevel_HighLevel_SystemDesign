package org.example.DesignPattern.BehavoiralDesignPattern.MementoDesignPattern.Example;

public class ConfigurationMemento {
    int height;
    int width;

    ConfigurationMemento(int height, int width){
        this.height = height;
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
}
