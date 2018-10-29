import controller.InputCollector;
import model.Contact;
import model.ContactList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by paulo on 2018/10/25.
 */
public class Driver {
    public static void main(String[] args) {

        System.out.println("----- MAIN MENU -----");
        System.out.println(" ");
        System.out.println("new - Create a new contact");
        System.out.println("list - List all contacts");
        System.out.println("quit - Exit Application");
        System.out.println(" ");
        System.out.printf("> ");

        Scanner in = new Scanner(System.in);
        String menuCommand = in.nextLine();

        ContactList contactList = new ContactList();
        int id = 0;
        do {
            // Task2
            if (menuCommand.equals("quit")) {
                System.out.println("quit - Exit Application");
                System.exit(0);
            }

            // Task3
            if (menuCommand.equals("new")) {
                System.out.println("Take a full name and email");
                System.out.println("Enter your name");
                InputCollector inputCollector = new InputCollector();
                String userInput = in.nextLine();
                String user = inputCollector.inputForPrompt(userInput);

                System.out.println("Enter your email");
                String emailInput = in.nextLine();
                String email = inputCollector.inputForPrompt(emailInput);
                Contact contact = new Contact(id, user, email);
                contactList.addContact(contact);

                contactList.printList();

            }

            // Task 4
            if (menuCommand.equals("list")) {
                System.out.println("list - List all contacts");
                contactList.printList();
            }

            System.out.println("----- MAIN MENU -----");
            System.out.println(" ");
            System.out.println("new - Create a new contact");
            System.out.println("list - List all contacts");
            System.out.println("quit - Exit Application");
            System.out.println(" ");
            System.out.printf("> ");

            menuCommand = in.nextLine();

            id++;

        } while(!menuCommand.equals("quit"));

    }
}
