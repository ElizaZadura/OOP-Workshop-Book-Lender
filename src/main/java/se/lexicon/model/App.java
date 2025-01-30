package se.lexicon.model;


public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        Book book = new Book("Book One", "Author One");
        Book book2 = new Book("Book Two", "Author Two");

        System.out.println(book.getBookInformation() + "\n" + book2.getBookInformation());

        Person person = new Person("First", "One");
        Person secondPerson = new Person("Second", "One");

        System.out.println(secondPerson.getPersonInformation());
        System.out.println(person.getPersonInformation());
        // Simulate borrowing a book
        person.loanBook(book);
        // Simulate returning a book
        person.returnBook(book);

    }

}
