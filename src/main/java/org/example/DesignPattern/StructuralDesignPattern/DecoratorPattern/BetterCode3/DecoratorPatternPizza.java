package org.example.DesignPattern.StructuralDesignPattern.DecoratorPattern.BetterCode3;

public class DecoratorPatternPizza {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        // Cheese Pizza - Send the pizza to the decorator class and add Pizza to it.
        pizza = new CheeseDecorator(pizza);
        pizza = new OlivesDecorator(pizza);
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }
}
class BasicPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
interface Pizza {
    String getDescription();
    double getCost();
}
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
// There are many class for the toppings and they will extend the Decorator class.
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    } // The Base Pizza it needs to be pass.

    public String getDescription() {
        return pizza.getDescription()+"Cheese Pizza";
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}
class OlivesDecorator extends PizzaDecorator {
    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription()+"Olives Pizza";
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 0.5;
    }
}
class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription()+"Mushroom Pizza";
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}

















