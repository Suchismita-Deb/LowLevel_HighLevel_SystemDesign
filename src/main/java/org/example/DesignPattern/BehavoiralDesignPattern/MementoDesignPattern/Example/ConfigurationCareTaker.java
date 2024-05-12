package org.example.DesignPattern.BehavoiralDesignPattern.MementoDesignPattern.Example;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }
    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            int lastIndex = history.size()-1;
            ConfigurationMemento lastMemento = history.get(lastIndex);
            history.remove(lastIndex);
            return lastMemento;
        }
        return null;
    }
}
