package buns.coffees;

import buns.Coffee;

public class HotTea extends Coffee {
    @Override
    public String getDescription() {
        return "Hot Tea";
    }

    @Override
    public Double produce() {
        return 3.45;
    }
}
