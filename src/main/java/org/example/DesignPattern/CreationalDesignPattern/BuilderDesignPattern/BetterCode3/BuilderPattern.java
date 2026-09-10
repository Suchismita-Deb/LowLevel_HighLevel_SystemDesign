package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.BetterCode3;

import java.util.Scanner;

public class BuilderPattern {

    // Entry point for running the builder demo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Full meal input
        String fullMainDish = sc.nextLine();
        String fullSideDish = sc.nextLine();
        String fullDrink = sc.nextLine();
        String fullDessert = sc.nextLine();
        String fullAppetizer = sc.nextLine();

        Meal meal = new MealBuilder(fullMainDish, fullSideDish, fullDrink)
                .setDessert(fullDessert)
                .setAppetizer(fullAppetizer)
                .build();

        System.out.println("Full Meal Summary:");
        meal.printMealSummary();

        // Simple meal input
        String simpleMainDish = sc.nextLine();
        String simpleSideDish = sc.nextLine();
        String simpleDrink = sc.nextLine();

        Meal simpleMeal = new MealBuilder(simpleMainDish, simpleSideDish, simpleDrink)
                .build();

        System.out.println("Simple Meal Summary:");
        simpleMeal.printMealSummary();

        sc.close();
    }
}

// ---------------- Meal class ----------------
class Meal {
    private String mainDish;
    private String sideDish;
    private String drink;
    private String dessert;
    private String appetizer;

    // Private constructor — only accessible via getInstance
    private Meal(MealBuilder builder) {
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.appetizer = builder.appetizer;
    }

    // Static factory method used by MealBuilder
    public static synchronized Meal getInstance(MealBuilder builder) {
        return new Meal(builder);
    }

    public void printMealSummary() {
        System.out.println("Main Dish: " + mainDish);
        System.out.println("Side Dish: " + sideDish);
        System.out.println("Drink: " + drink);
        System.out.println("Dessert: " + dessert);
        System.out.println("Appetizer: " + appetizer);
    }
}

// ---------------- MealBuilder class ----------------
class MealBuilder {
    public String mainDish;
    public String sideDish;
    public String drink;
    public String dessert = "Default Dessert";
    public String appetizer = "Default Appetizer";

    public MealBuilder(String mainDish, String sideDish, String drink) {
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
    }

    public MealBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public MealBuilder setAppetizer(String appetizer) {
        this.appetizer = appetizer;
        return this;
    }

    public Meal build() {
        return Meal.getInstance(this);
    }
}

