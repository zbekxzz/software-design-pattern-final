package buns.coffees;

import buns.Coffee;

public class FrappuccinoCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Frappuccino Coffee";
    }

    @Override
    public Double produce() {
        return 4.45;
    }
}
