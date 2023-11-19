package buns.coffees;

import buns.Coffee;

public class Espresso extends Coffee {

    @Override
    public String getDescription() {
        return "Espresso";
    }
    @Override
    public Double produce() {
        return 2.00;
    }
}
