package com.Assesment.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    void testConstructorAndGetters() {
        Book book = new Book("Title", "Author");

        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertTrue(book.isAvailable());
    }

    @Test
    void testSetterAndIsAvailable() {
        Book book = new Book("Title", "Author");

        assertTrue(book.isAvailable());
        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }

    @Test
    void testDefaultAvailability() {
        Book book = new Book("Title", "Author");

        assertTrue(book.isAvailable());
    }

    @Test
    void testSetAvailableAfterBorrowing() {
        Book book = new Book("Title", "Author");

        assertTrue(book.isAvailable());
        book.setAvailable(false);
        assertFalse(book.isAvailable());

        // Simulating returning the book
        book.setAvailable(true);
        assertTrue(book.isAvailable());
    }

    // Additional tests can be added based on the specific requirements of your Book class
}
