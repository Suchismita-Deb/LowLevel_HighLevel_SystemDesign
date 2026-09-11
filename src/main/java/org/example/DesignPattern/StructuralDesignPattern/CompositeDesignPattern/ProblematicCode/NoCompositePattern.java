package org.example.DesignPattern.StructuralDesignPattern.CompositeDesignPattern.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class NoCompositePattern {

    public static void main(String[] args) {
        File file1 = new File("File 1");
        File file2 = new File("File 2");
        File file3 = new File("File 3");

        Folder folder1 = new Folder("Folder 1");
        folder1.add(file1);
        folder1.add(file2);

        folder1.showDetails();
    }
}

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String showDetails() {
        return name;
    }
}
class Folder {
    private String name;
    private List<File> files = new ArrayList<File>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(File file) {
        files.add(file);
    }

    public void showDetails() {
        System.out.println("Folder Name - " + name);
        for (File file : files) {

            System.out.println(file.showDetails());
        }
    }
}