package org.example.DesignPattern.StructuralDesignPattern.ProxyPattern.ProblematicCode;

public class NoProxyPattern {
    public static void main(String[] args) {
        Image image = new RealImage("test_image.jpg");
        image.display(); // The image is loaded from disk and displayed.
        // It will load the image from the disk. The imahe is created there is no need to load the image.
        Image image2 = new RealImage("test_image2.jpg");

        // Display the image in 2 places then it will take the time.
    }
}

interface Image {
    void display();
}


class RealImage implements Image {
    private String fileName; // The file name to load and display.

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();// The expensive operation.
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk...");
    }
}