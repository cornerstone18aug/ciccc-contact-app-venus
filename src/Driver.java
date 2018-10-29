import controller.InputCollector;
import model.Contact;
import model.ContactList;
import java.util.Scanner;

/**
 * Created by paulo on 2018/10/25.
 */
public class Driver {
    public static void main(String[] args) {

        System.out.println("-------------------------------");
        System.out.println("---------- MAIN MENU ----------");
        System.out.println("-------------------------------");
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
                System.out.println(" ");
                System.out.println("quit - Exit Application");
                System.exit(0);
            }

            // Task3
            if (menuCommand.equals("new")) {
                System.out.println(" ");
                System.out.printf("Enter your name: ");
                InputCollector inputCollector = new InputCollector();
                String userInput = in.nextLine();
                String user = inputCollector.inputForPrompt(userInput);

                System.out.printf("Enter your email: ");
                String emailInput = in.nextLine();
                String email = inputCollector.inputForPrompt(emailInput);

                System.out.printf("Enter your cellphone: ");
                String cellphoneInput = in.nextLine();
                String cellphone = inputCollector.inputForPrompt(cellphoneInput);

                System.out.printf("Enter your address: ");
                String addressInput = in.nextLine();
                String address = inputCollector.inputForPrompt(addressInput);

                Contact contact = new Contact(id, user, email, cellphone, address);
                contactList.addContact(contact);
                System.out.println(" ");
                System.out.println("Contact saved as: ");
                System.out.println(" ");
                contactList.printList();
                System.out.println(" ");
                System.out.println(" ");


                id++;


            }

            // Task 4
            if (menuCommand.equals("list")) {
                System.out.println(" ");
                System.out.println("All contacts");
                System.out.println(" ");
                contactList.printList();
            }




            System.out.println("-------------------------------");
            System.out.println("---------- MAIN MENU ----------");
            System.out.println("-------------------------------");
            System.out.println(" ");
            System.out.println("new - Create a new contact");
            System.out.println("list - List all contacts");
            System.out.println("quit - Exit Application");
            System.out.println(" ");
            System.out.printf("> ");


            menuCommand = in.nextLine();


        } while(!menuCommand.equals("quit"));

    }
}
