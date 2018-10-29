import controller.InputCollector;
import model.Contact;

import java.util.Scanner;

/**
 * Created by paulo on 2018/10/25.
 */
public class Menu {
    public static void main(String[] args) {

        System.out.println("----- MAIN MENU -----");
        System.out.println(" ");
        System.out.println("1 - Create a new contact");
        System.out.println("2 - List all contacts");
        System.out.println("3 - Exit Application");
        System.out.println(" ");
        System.out.printf("> ");

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();

        do {


            if (s == 1) {
                System.out.println("1 - Create a new contact");
                System.out.println("Enter user name");
                InputCollector inputCollector = new InputCollector();
                String userInput = in.nextLine();
                String user = inputCollector.inputForPrompt(userInput);

                System.out.println("Enter user name");
                String emailInput = in.nextLine();
                String email = inputCollector.inputForPrompt(emailInput);

                Contact contact = new Contact(user, email);

            }

            if (s == 2) {
                System.out.println("2 - List all contacts");
            }

//            System.out.println(" ");
//            System.out.println("----- MAIN MENU -----");
//            System.out.println(" ");
//            System.out.println("1 - Create a new contact");
//            System.out.println("2 - List all contacts");
//            System.out.println("3 - Exit Application");
//            System.out.println(" ");
//            System.out.printf("> ");
//
//            s = in.nextInt();


        }

        while (s != 3);














    }
}
