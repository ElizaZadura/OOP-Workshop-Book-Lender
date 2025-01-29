package se.lexicon.model;


public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        Book book = new Book("Book One", "Author One");
        System.out.println(book.getBookInformation());

        Person person = new Person("One", "Two");
        System.out.println(person.getPersonInformation());
        // Simulate borrowing a book
        person.loanBook(book);
        // Simulate returning a book
        person.returnBook(book);

    }

}
