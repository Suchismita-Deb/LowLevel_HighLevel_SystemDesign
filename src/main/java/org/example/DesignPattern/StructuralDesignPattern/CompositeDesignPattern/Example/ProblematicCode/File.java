package org.example.DesignPattern.StructuralDesignPattern.CompositeDesignPattern.Example.ProblematicCode;

public class File {
    String fileName;
    public File(String name){
        this.fileName = name;
    }
    public void ls(){
        System.out.println("The file name is : "+fileName);
    }
}
