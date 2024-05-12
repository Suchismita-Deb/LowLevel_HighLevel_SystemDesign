package org.example.DesignPattern.StructuralDesignPattern.CompositeDesignPattern.Example.BetterCode;

public class File implements FileSystem{
    String fileName;
    public File(String name){
        this.fileName = name;
    }
    @Override
    public void ls(){
        System.out.println("The file name is : "+fileName);
    }
}
