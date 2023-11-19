package buns.topping;

import buns.Coffee;
import buns.CoffeeDecorator;

public class CaramelSyrup extends CoffeeDecorator {
    public CaramelSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with caramel syrup";
    }

    @Override
    public Double produce() {
        return super.produce() + 0.6;
    }
}
