import buns.Status;
import buns.User;
import service.implementation.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            boolean admin = false;
            System.out.println("Welcome to Bek Cafe!\nYou need to log in.");
            System.out.print("Enter your login: ");
            String username = new Scanner(System.in).nextLine();
            System.out.print("Enter your password: ");
            String password = new Scanner(System.in).nextLine();
            Auth auth = new Auth();
            User user = auth.auth(username, password);
            if (user != null) {
                if (user.getStatus().equals(Status.ADMIN)) {
                    admin = true;
                }
                System.out.println("You have successfully authorized!");
            }
            InterfaceProcessor interfaceProcessor = new InterfaceProcessor();
            if (admin) {
                interfaceProcessor.setInterfaceStrategy(new AdminInterface());
                interfaceProcessor.getInterface();
                break;
            } else {
                interfaceProcessor.setInterfaceStrategy(new UserInterface());
                interfaceProcessor.getInterface();
                break;
            }
        }
    }
}