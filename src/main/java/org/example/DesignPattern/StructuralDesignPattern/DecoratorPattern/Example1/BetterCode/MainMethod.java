package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.Example1.BetterCode;

public class MainMethod {
    public static void main(String[] args) {
        BasePizza pizza = new Margherita();
        System.out.println(pizza.cost());
        // Margherita and Beg Delight are base so first called and get the object.
        // It also hold the price. Then the ExtraCheese toppings is added and get the object and the price.
        // Then Mushroom is called and object is pass in the constructor and calculated the price.
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println(pizza1.cost());
    }
}
