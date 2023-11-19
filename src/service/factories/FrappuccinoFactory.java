package service.factories;

import buns.Coffee;
import buns.coffees.FrappuccinoCoffee;
import service.CoffeeFactory;

public class FrappuccinoFactory extends CoffeeFactory {
    @Override
    public Coffee brewCoffee() {
        System.out.println("Your Frappuccino is being prepared.");
        return new FrappuccinoCoffee();
    }
}
