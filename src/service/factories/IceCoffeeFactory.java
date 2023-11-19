package service.factories;

import buns.Coffee;
import buns.coffees.IceCoffee;
import service.CoffeeFactory;

public class IceCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee brewCoffee() {
        System.out.println("Your Ice Coffee is being prepared.");
        return new IceCoffee();
    }
}
