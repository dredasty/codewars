package org.fresh.patterns.decorator;

public class MainClass {
    public static void main(String[] args) {
        Coffee c = new EspressoCoffee();
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(c);
        CoffeeWithSprinkles coffeeWithSprinkles = new CoffeeWithSprinkles(c);
        CoffeeWithSprinkles coffeeWithSprinklesAndMilk = new CoffeeWithSprinkles(coffeeWithMilk);

        System.out.println(c.getIngredients() + " costs " + c.getCost());
        System.out.println(coffeeWithMilk.getIngredients() + " costs " + coffeeWithMilk.getCost());
        System.out.println(coffeeWithSprinkles.getIngredients() + " costs " + coffeeWithSprinkles.getCost());
        System.out.println(coffeeWithSprinklesAndMilk.getIngredients() + " costs " + coffeeWithSprinklesAndMilk.getCost());
    }
}
