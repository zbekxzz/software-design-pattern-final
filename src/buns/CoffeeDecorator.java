package buns;

import service.CoffeeFactory;

public abstract class CoffeeDecorator extends Coffee {
    protected final Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public Double produce() {
        return coffee.produce();
    }
}
