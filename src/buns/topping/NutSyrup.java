package buns.topping;

import buns.Coffee;
import buns.CoffeeDecorator;

public class NutSyrup extends CoffeeDecorator {
    public NutSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with nut syrup";
    }

    @Override
    public Double produce() {
        return super.produce() + 0.8;
    }
}
