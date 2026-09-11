package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;

    ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
