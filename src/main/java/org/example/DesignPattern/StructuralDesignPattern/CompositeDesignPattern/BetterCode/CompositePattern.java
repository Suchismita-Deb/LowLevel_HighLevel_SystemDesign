package org.example.DesignPattern.StructuralDesignPattern.CompositeDesignPattern.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {

    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File 1");
        FileSystemComponent file2 = new File("File 2");

        Folder folder1 = new Folder("Folder 1");
        folder1.add(file1);
        folder1.add(file2);

        Folder subFolder = new Folder("Subfolder ");
        FileSystemComponent file3 = new File("File 3");
        subFolder.add(file3);
        folder1.add(subFolder);
        folder1.showDetails();
    }
}

interface FileSystemComponent {
    void showDetails();
}

class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println(name);
    }
}

class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    public void add(FileSystemComponent component) {
        files.add(component); // The list will add any component not file or folder.
    }

    public void showDetails() {
        System.out.println("Folder Name - " + name);
        for (FileSystemComponent file : files) {
            file.showDetails(); // The fileComponent can be File or Folder and it will call the class.

        }
        // It is the recursive implementation of the Folder - Folder - File and all and it is DFS.

    }
}