package buns.topping;

import buns.Coffee;
import buns.CoffeeDecorator;

public class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with whipped cream";
    }

    @Override
    public Double produce() {
        return super.produce() + 0.3;
    }
}
