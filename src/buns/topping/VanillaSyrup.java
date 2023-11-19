package buns.topping;

import buns.Coffee;
import buns.CoffeeDecorator;

public class VanillaSyrup extends CoffeeDecorator {
    public VanillaSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with vanilla syrup";
    }

    @Override
    public Double produce() {
        return super.produce() + 0.5;
    }
}
