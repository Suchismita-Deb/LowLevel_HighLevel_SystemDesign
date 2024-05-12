package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.Example1.BetterCode;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza; // ToppingDecorator has-a relation with BasePizza.

    Mushroom(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
