package service.factories;

import buns.Coffee;
import buns.coffees.Matcha;
import service.CoffeeFactory;

public class MatchaFactory extends CoffeeFactory {
    @Override
    public Coffee brewCoffee() {
        System.out.println("Your Matcha Tea is being prepared.");
        return new Matcha();
    }
}
