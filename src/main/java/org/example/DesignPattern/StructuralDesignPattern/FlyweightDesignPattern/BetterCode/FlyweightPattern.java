package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.BetterCode;

import java.util.HashMap;

public class FlyweightPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("Red", i * 10, i * 20, 100);
            Bullet bullet2 = new Bullet("Green", i * 10, i * 20, 100);
        }
        // The issue in the code is the memory overhead and every bullet stores the redundant data like the color.
    }
}

class BulletType {
    // Flyweight class
    private String color;

    public BulletType(String color) {
        this.color = color;
        System.out.println("BulletType created with color: " + color);
    } // All the bullet will share the BulletType object.

}

class Bullet {
    private BulletType type; // The type of the bullet in case already present so it will be used.


    // The Red bullet when created the Bullet class should know that the red bullet exists so it will use the existing bullet.

    // The best way to do is to use the HashMap and store the bullet object.
    private int x, y;
    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.type = BulletTypeFactory.getBulletType(color); // The bullet exists then use the existing value.
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }
}

class BulletTypeFactory {
    private static final HashMap<String, BulletType> bulletTypes = new HashMap<>();

    // The private static final HashMap as it will not be changed.

    // It is static meaning one hashMap is shared by all object of bullet type factory.

    public static BulletType getBulletType(String color) {
        if (!bulletTypes.containsKey(color)) {
            bulletTypes.put(color, new BulletType(color));
        }
        return bulletTypes.get(color);
    }
}