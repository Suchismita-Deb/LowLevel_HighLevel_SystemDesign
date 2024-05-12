package org.example.DesignPattern.StructuralDesignPattern.CompositeDesignPattern.Example.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> objectList;
    public Directory(String directoryName){
        this.directoryName = directoryName;
        objectList = new ArrayList<>();
    }
    public void add(FileSystem obj){
        objectList.add(obj);
    }
    @Override
    public void ls() {
        System.out.println("Directory name : " + directoryName);
        for(FileSystem fileSystem : objectList){
            fileSystem.ls();
        }
    }
}
