import java.util.Scanner;

public class menu {
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
            }

            if (s == 2) {
                System.out.println("2 - List all contacts");
            }

            System.out.println(" ");
            System.out.println("----- MAIN MENU -----");
            System.out.println(" ");
            System.out.println("1 - Create a new contact");
            System.out.println("2 - List all contacts");
            System.out.println("3 - Exit Application");
            System.out.println(" ");
            System.out.printf("> ");

            s = in.nextInt();


        }

        while (s != 3);














    }
}

