package librarymanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {

            System.out.println("\n====== LIBRARY MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Display Available Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                Book book = new Book(id, title, author);
                library.addBook(book);

                break;

            case 2:

                System.out.print("Enter Book ID to Issue: ");
                int issueId = sc.nextInt();

                library.issueBook(issueId);

                break;

            case 3:

                System.out.print("Enter Book ID to Return: ");
                int returnId = sc.nextInt();

                library.returnBook(returnId);

                break;

            case 4:

                System.out.println("\nSearch By");
                System.out.println("1. Book ID");
                System.out.println("2. Book Title");
                System.out.print("Enter Choice: ");

                int searchChoice = sc.nextInt();
                sc.nextLine();

                if (searchChoice == 1) {

                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    Book b1 = library.searchById(searchId);

                    if (b1 != null)
                        System.out.println(b1);
                    else
                        System.out.println("Book Not Found.");

                } else if (searchChoice == 2) {

                    System.out.print("Enter Book Title: ");
                    String searchTitle = sc.nextLine();

                    Book b2 = library.searchByTitle(searchTitle);

                    if (b2 != null)
                        System.out.println(b2);
                    else
                        System.out.println("Book Not Found.");

                } else {

                    System.out.println("Invalid Choice.");

                }

                break;

            case 5:

                library.displayAvailableBooks();

                break;

            case 6:

                System.out.println("Thank You!");

                break;

            default:

                System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();

    }
}