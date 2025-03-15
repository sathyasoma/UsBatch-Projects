package com.java.coding.interview;
/*
 * Can you create a searchable digital library catalog? 
 * 
 * Explanantion:
 * ------------
 *   Design a class for a digital library catalog that allows 
 *   efficient searching by title, author, or genre. 
 *   Implement methods to add books and search for books. 
 *    with java
 * 
 * 
 * */
import java.util.*;

public class DigitalLibraryCatalog {
    // Data structures to hold book information
    private Map<String, Book> booksByTitle;
    private Map<String, Set<Book>> booksByAuthor;
    private Map<String, Set<Book>> booksByGenre;

    // Constructor
    public DigitalLibraryCatalog() {
        booksByTitle = new HashMap<>();
        booksByAuthor = new HashMap<>();
        booksByGenre = new HashMap<>();
    }

    // Inner class to represent a Book
    private static class Book {
        String title;
        String author;
        String genre;

        public Book(String title, String author, String genre) {
            this.title = title;
            this.author = author;
            this.genre = genre;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", Genre: " + genre;
        }
    }

    // Method to add a book to the catalog
    public void addBook(String title, String author, String genre) {
        Book book = new Book(title, author, genre);
        
        // Add book to booksByTitle
        booksByTitle.put(title, book);

        // Add book to booksByAuthor
        booksByAuthor.putIfAbsent(author, new HashSet<>());
        booksByAuthor.get(author).add(book);

        // Add book to booksByGenre
        booksByGenre.putIfAbsent(genre, new HashSet<>());
        booksByGenre.get(genre).add(book);
    }

    // Method to search for books by title
    public Book searchByTitle(String title) {
        return booksByTitle.get(title);
    }

    // Method to search for books by author
    public Set<Book> searchByAuthor(String author) {
        return booksByAuthor.getOrDefault(author, Collections.emptySet());
    }

    // Method to search for books by genre
    public Set<Book> searchByGenre(String genre) {
        return booksByGenre.getOrDefault(genre, Collections.emptySet());
    }

    // Main method for demonstration
    public static void main(String[] args) {
        DigitalLibraryCatalog catalog = new DigitalLibraryCatalog();

        // Adding books to the catalog
        catalog.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        catalog.addBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
        catalog.addBook("1984", "George Orwell", "Dystopian");
        catalog.addBook("Moby Dick", "Herman Melville", "Adventure");

        // Searching books by title
        System.out.println("Search by title:");
        System.out.println(catalog.searchByTitle("1984"));

        // Searching books by author
        System.out.println("\nSearch by author:");
        Set<Book> booksByAuthor = catalog.searchByAuthor("F. Scott Fitzgerald");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }

        // Searching books by genre
        System.out.println("\nSearch by genre:");
        Set<Book> booksByGenre = catalog.searchByGenre("Fiction");
        for (Book book : booksByGenre) {
            System.out.println(book);
        }
    }
}

