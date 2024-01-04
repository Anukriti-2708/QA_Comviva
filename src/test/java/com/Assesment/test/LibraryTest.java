package com.Assesment.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void testAddBookAndGetBooks() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");

        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());
        assertTrue(library.getBooks().contains(book1));
        assertTrue(library.getBooks().contains(book2));
    }

    @Test
    void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author");
        library.addBook(book);

        assertTrue(book.isAvailable());
        library.borrowBook("Title");
        assertFalse(book.isAvailable());
    }

    @Test
    void testReturnBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author");
        library.addBook(book);

        library.borrowBook("Title");
        assertFalse(book.isAvailable());
        library.returnBook("Title");
        assertTrue(book.isAvailable());
    }

    @Test
    void testBorrowNonexistentBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author");
        library.addBook(book);

        assertDoesNotThrow(() -> library.borrowBook("NonexistentTitle"));
    }

    @Test
    void testReturnNonexistentBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author");
        library.addBook(book);

        assertDoesNotThrow(() -> library.returnBook("NonexistentTitle"));
    }
}