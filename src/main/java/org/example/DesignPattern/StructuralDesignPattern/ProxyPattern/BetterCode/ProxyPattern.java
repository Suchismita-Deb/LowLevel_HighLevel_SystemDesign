package org.example.DesignPattern.StructuralDesignPattern.ProxyPattern.BetterCode;

public class ProxyPattern {

    public static void main(String[] args) {
        Image img1 = new ProxyImage("image1.jpg");
        Image img2 = new ProxyImage("image2.jpg");
        // The image is loaded lazily when needed and saving the time and resource in case the image is never displayed.
        img1.display();
        img1.display(); // The first time it will create and load and the next time it will use the cache value.
    }
}
interface Image {
    void display();
}
class ProxyImage implements Image {
    private String filename; // The Real image was always loading when it was initialized.

    // The ProxyImage should behave differently and it should not load when it is initialized.
    // The ProxyImage will hold the reference of the image.

    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;

    }
    @Override
    public void display() {

        // The main method will call the realImage.display to display the image and it is pointing to proxyImage.display so when the realImage is initialized meaning it already has the value then it will call the realImage.
        if(realImage == null) {
            realImage = new RealImage(filename);// The first time the real image will be loaded to the proxy image.
        }
        System.out.println("ProxyImage display.");
    }
}
// The RealImage and ProxyImage are two implementation of the Image interface.
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