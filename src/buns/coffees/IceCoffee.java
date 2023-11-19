package buns.coffees;

import buns.Coffee;

public class IceCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Ice Coffee";
    }

    @Override
    public Double produce() {
        return 2.45;
    }
}
