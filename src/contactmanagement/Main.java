package contactmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        int choice;

        do {

            System.out.println("\n====== CONTACT MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display Contacts");
            System.out.println("6. Save Contacts");
            System.out.println("7. Load Contacts");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Phone: ");
                String phone = sc.nextLine();

                manager.addContact(new Contact(name, phone));

                break;

            case 2:

                System.out.print("Enter Name to Search: ");
                Contact contact = manager.searchContact(sc.nextLine());

                if (contact != null)
                    System.out.println(contact);
                else
                    System.out.println("Contact Not Found.");

                break;

            case 3:

                System.out.print("Enter Name to Update: ");
                String updateName = sc.nextLine();

                System.out.print("Enter New Phone: ");
                String newPhone = sc.nextLine();

                manager.updateContact(updateName, newPhone);

                break;

            case 4:

                System.out.print("Enter Name to Delete: ");
                manager.deleteContact(sc.nextLine());

                break;

            case 5:

                manager.displayContacts();

                break;

            case 6:

                manager.saveContacts();

                break;

            case 7:

                manager.loadContacts();

                break;

            case 8:

                System.out.println("Thank You!");
                break;

            default:

                System.out.println("Invalid Choice!");

            }

        } while (choice != 8);

        sc.close();
    }
}