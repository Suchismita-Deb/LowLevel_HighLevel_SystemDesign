In application the direct access to an object might not be desirable due to reasons like security, resource optimization or controlled access.

The proxy pattern provides a surrogate or placeholder for another object to control access to it.

In an application the system load heavyobject like a large image form disk. 
Image size 1080 X 720 X 3(each pixel contains 3 int) X 4(bytes) X 8(bits) 
It will take time to load the image and to get any data of the image it will take the memory. In display we have to load the image and to get the details we dont have to load the image. Without the proxy the application will load the image every time its needed even its not displayed waste of resource.
Image details like name and location then proxy to get the details.


In the code display or making the image will take time and memory.  
In proxy the lazy loading and caching is used. There is ProxyImage class and Real Image class implements the Image.


RealImage loads the file immediately in the constructor.  
If we move loadFromDisk() into a separate method, then the main method must remember to call load() before display().   
Issue: Client code has extra responsibility → risk of forgetting → broken behavior.

ProxyImage holds the filename but doesn’t load right away.  
When display() is called, the proxy checks if RealImage exists - If not, it creates and loads it.  
Then calls display() on the real object.  

Benefit: Client just calls display(). Loading is automatic, lazy, and hidden.

```java
class RealImage {
    private String filename;
    private boolean loaded = false;

    public RealImage(String filename) {
        this.filename = filename;
    }

    public void load() {
        if (!loaded) {
            System.out.println("Loading " + filename);
            loaded = true;
        }
    }

    public void display() {
        if (!loaded) {
            System.out.println("Image not loaded yet!");
        } else {
            System.out.println("Displaying " + filename);
        }
    }
}


public static void main(String[] args) {
    RealImage image = new RealImage("photo1.jpg");
    // Must remember to call load()
    image.load();
    image.display();
}
```

When the loading is actually happenning?

In proxy the loading happens only when display() is called. The proxy checks if the real image exists; if not, it creates it and loads from disk at that moment. When you create img1 or img2 as ProxyImage objects → nothing is loaded yet. The proxy only stores the filename. When you call display() on the proxy → at that moment, the proxy checks if the real image exists. If not, it creates the RealImage, which then loads the file from disk.

So the loading happens inside the proxy, but only at the time of first display() call. We create many proxy objects without paying the cost upfront. The actual heavy loading is deferred until you truly need to show the image.

In the realImage the loading happens immediately when the object is made (in constructor). If you move loadFromDisk() to a separate method, then the main method must remember to call load() before display().



When need metadata (like filename, size, type), the proxy can provide that directly without loading the full image.

The proxy holds lightweight info (e.g., the filename string) and can expose methods like getName() or getSize() that don’t trigger the heavy loadFromDisk().

The real image is only created and loaded when you actually need the full content (e.g., calling display()).