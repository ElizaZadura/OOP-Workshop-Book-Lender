package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Person {

    private final int id;
    private final String firstName;
    private final String lastName;
    private static int sequencer = 0;
    private List <Book> borrowedBooks;

    public Person(String firstName, String lastName) {
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new ArrayList<>();
    }
    public List<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks); // Return a copy to prevent modification outside the class
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            this.borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(firstName + " " + lastName + " borrowed " + book.getTitle() + ".");
        } else {
            System.out.println(book.getTitle() + " is currently unavailable.");
        }
    }

    private static int getNextId() {
        return ++sequencer;
    }


    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.setAvailable(true);
            borrowedBooks.remove(book);
            System.out.println(firstName + " " + lastName + " returned " + book.getTitle() + ".");
        } else {
            System.out.println(firstName + " " + lastName + " did not borrow " + book.getTitle() + ".");
        }
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonInformation() {
        return String.format("{id: %s firstName: %s, lastName: %s}", id, firstName, lastName);
    }

}
