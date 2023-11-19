package service.implementation;

import buns.Status;
import buns.Supplier;
import buns.User;
import service.Interface;
import service.observing.OrderSystem;

import java.util.Scanner;

public class AdminInterface implements Interface {
    @Override
    public void getInterface() {
        Auth auth = new Auth();
        System.out.println("You successfully authorized as ADMIN\nYou can:");
        boolean run = true;
        while (run) {
            System.out.println("""
                    1. Receive delivery to the Cafe
                    2. Add new supplier
                    3. Add new user
                    4. Exit"""
            );
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1 -> {
                    OrderSystem orderSystem = new OrderSystem();
                    System.out.print("Write your order message: ");
                    String order = new Scanner(System.in).nextLine();
                    orderSystem.placeOrder(order);
                }
                case 2 -> {
                    System.out.print("Enter id: ");
                    int supplierId = new Scanner(System.in).nextInt();
                    System.out.print("Enter name tag: ");
                    String nameTag = new Scanner(System.in).nextLine();
                    System.out.print("Enter supplier email: ");
                    String supplierEmail = new Scanner(System.in).nextLine();
                    Supplier supplier = new Supplier(supplierId, nameTag, supplierEmail);
                    auth.registerSupplier(supplier);
                }
                case 3 -> {
                    System.out.print("Enter id: ");
                    Long id = new Scanner(System.in).nextLong();
                    System.out.print("Enter login: ");
                    String username = new Scanner(System.in).nextLine();
                    System.out.print("Enter password: ");
                    String password = new Scanner(System.in).nextLine();
                    User user = new User(id, username, Status.USER, password);
                    auth.registerUser(user);
                    System.out.println("Рады видеть нового пользователя!");
                }
                case 4 -> run = false;
            }
        }
    }
}
