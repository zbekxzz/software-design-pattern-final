package service.implementation;

import buns.Coffee;
import buns.topping.CaramelSyrup;
import buns.topping.NutSyrup;
import buns.topping.VanillaSyrup;
import buns.topping.WhippedCream;
import service.CoffeeFactory;
import service.Interface;
import service.factories.*;
import service.payment.CurrencyAdapter;
import service.payment.CurrencyConverter;
import service.payment.PaymentProcessor;

import java.util.Scanner;

public class UserInterface implements Interface {
    @Override
    public void getInterface() {
        System.out.println("Glad to see you my friend!");
        boolean run = true;
        while (run) {
            System.out.println("""

                    1. Menu
                    2. Order a coffee
                    3. Exit"""
            );
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("""
                            Our coffees:
                            1. Espresso
                            2. Ice coffee
                            3. Matcha Tea
                            4. Frappuccino
                            5. Hot tea"""
                    );
                    break;
                case 2:
                    CoffeeFactory factory = null;
                    System.out.print("Choose a coffee with number: ");
                    int order = new Scanner(System.in).nextInt();

                    Double price;
                    switch (order) {
                        case 1 -> factory = new EspressoFactory();
                        case 2 -> factory = new IceCoffeeFactory();
                        case 3 -> factory = new MatchaFactory();
                        case 4 -> factory = new FrappuccinoFactory();
                        case 5 -> factory = new HotTeaFactory();
                        default -> System.out.println("There is no this item!");
                    }
                    if (factory == null) {
                        System.out.println("You haven't placed an order");
                        return;
                    }

                    Coffee coffee = factory.brewCoffee();
                    System.out.print("""
                            We have some toppings for you, would you some?
                            1. Caramel Syrup
                            2. Nut Syrup
                            3. Vanilla Syrup
                            4. Whipped Cream
                            5. Without toppings
                            Your choice:\s""");
                    int topping = new Scanner(System.in).nextInt();
                    Coffee finalCoffee = coffee;
                    switch (topping) {
                        case 1 -> finalCoffee = new CaramelSyrup(coffee);
                        case 2 -> finalCoffee = new NutSyrup(coffee);
                        case 3 -> finalCoffee = new VanillaSyrup(coffee);
                        case 4 -> finalCoffee = new WhippedCream(coffee);
                        default -> System.out.println("There is no this topping");
                    }

                    System.out.println("Please, your " + finalCoffee.getDescription() + "!");
                    System.out.println("It costs you " + finalCoffee.produce() + " euros");
                    System.out.print("How much you pay? (ex. 10 dollar): ");
                    String[] pay = new Scanner(System.in).nextLine().split(" ");
                    double userAmount = Double.parseDouble(pay[0]);
                    String userCurrency = pay[1];
                    PaymentProcessor paymentProcessor = new CurrencyAdapter(new CurrencyConverter());

                    paymentProcessor.deductFromOrder(userAmount, userCurrency, finalCoffee.produce());
                case 3:
                    run = false; break;
            }
        }
    }
}
