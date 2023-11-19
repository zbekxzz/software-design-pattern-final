package service.factories;

import buns.Coffee;
import buns.coffees.Espresso;
import service.CoffeeFactory;

public class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee brewCoffee() {
        System.out.println("Your Espresso is being prepared.");
        return new Espresso();
    }
}
