package service.factories;

import buns.Coffee;
import buns.coffees.HotTea;
import service.CoffeeFactory;

public class HotTeaFactory extends CoffeeFactory {
    @Override
    public Coffee brewCoffee() {
        System.out.println("Your Hot Tea is being prepared.");
        return new HotTea();
    }
}
