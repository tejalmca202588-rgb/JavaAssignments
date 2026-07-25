package librarymanagement;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully!");
    }

    // Display Available Books
    public void displayAvailableBooks() {

        boolean found = false;

        for (Book book : books) {

            if (!book.isIssued()) {

                System.out.println("---------------------");
                System.out.println(book);

                found = true;
            }
        }

        if (!found) {
            System.out.println("No Available Books.");
        }
    }

    // Search by ID
    public Book searchById(int id) {

        for (Book book : books) {

            if (book.getBookId() == id) {
                return book;
            }

        }

        return null;
    }

    // Search by Title
    public Book searchByTitle(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }

        }

        return null;
    }

    // Issue Book
    public void issueBook(int id) {

        Book book = searchById(id);

        if (book == null) {
            System.out.println("Book Not Found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book Already Issued.");
        } else {
            book.setIssued(true);
            System.out.println("Book Issued Successfully!");
        }

    }

    // Return Book
    public void returnBook(int id) {

        Book book = searchById(id);

        if (book == null) {
            System.out.println("Book Not Found.");
            return;
        }

        if (!book.isIssued()) {
            System.out.println("Book is Already Available.");
        } else {
            book.setIssued(false);
            System.out.println("Book Returned Successfully!");
        }

    }

}