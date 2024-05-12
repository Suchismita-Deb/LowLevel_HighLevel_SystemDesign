package org.example.DesignPattern.BehavoiralDesignPattern.MementoDesignPattern.Example;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();
        ConfigurationOriginator originatorObject = new ConfigurationOriginator(10,20);
        // save it.
        ConfigurationMemento save1 = originatorObject.createMemento();
        // add it to the history.
        careTakerObject.addMemento(save1);

        // originator changing to new state.
        originatorObject.width = 12;
        originatorObject.height = 19;
//        ConfigurationMemento save2 = originatorObject.createMemento();
//        careTakerObject.addMemento(save2);// When save then will not able to undo. After changing the state undo.


        // Undo.
        ConfigurationMemento restoreMementoObj = careTakerObject.undo();
        originatorObject.restoreMemento(restoreMementoObj);
        System.out.println(originatorObject.height +" "+originatorObject.width);
    }
}
