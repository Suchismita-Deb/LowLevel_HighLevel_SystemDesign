package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.ProblematicCode;

public class NoFlyweightPattern {

    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            Bullet bullet = new Bullet("Red", i*10, i*20, 100);
            Bullet bullet2 = new Bullet("Green", i*10, i*20, 100);
        }
        // The issue in the code is the memory overhead and every bullet stores the redundant data like the color.
    }
}
class Bullet {
    private String color;  // Intrinsic property.
    private int x,y; // Extrinsic property.
    private int velocity; // Extrinsic property.
    public Bullet(String color, int x, int y, int velocity) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Bullet created with color: " + color + ", x: " + x + ", y: " + y + ", velocity: " + velocity);
    }
    public void display(){
        System.out.println("Bullet color: " + color + ", x: " + x + ", y: " + y + ", velocity: " + velocity);
    }
}