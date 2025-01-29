package se.lexicon.model;

import java.util.UUID;

public class Book {
    private final UUID id;
    private final String title;
    private final String author;
    private boolean available;

    public Book(String title, String author) {
        //todo: add checks/constraints
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.available = true; // Default to available
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(boolean available) {
        this.available = !this.available;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getBookInformation() {
        return String.format("{id: %s, title: %s, author: %s, available: %s}", id, title, author, available);
    }
}
