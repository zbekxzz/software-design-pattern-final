package buns.coffees;

import buns.Coffee;

public class Matcha extends Coffee {
    @Override
    public String getDescription() {
        return "Matcha Tea";
    }

    @Override
    public Double produce() {
        return 3.65;
    }
}
