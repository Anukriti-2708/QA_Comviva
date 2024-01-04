package com.Assesment.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;



public class StringUtils_test 
{
	@Test
    void testReverse() {
        StringUtils stringUtils = new StringUtils();
        assertEquals("olleh", stringUtils.reverse("hello"));
        assertEquals("", stringUtils.reverse(""));
        assertEquals("a", stringUtils.reverse("a"));
    }

    @Test
    void testIsPalindrome() {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPalindrome("radar"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertTrue(stringUtils.isPalindrome(""));
    }

    @Test
    void testConcatenate() {
        StringUtils stringUtils = new StringUtils();
        assertEquals("HelloWorld", stringUtils.concatenate("Hello", "World"));
        assertEquals("ab", stringUtils.concatenate("a", "b"));
        assertEquals("test", stringUtils.concatenate("test", ""));
    }

    @Test
    void testCountOccurrences() {
        StringUtils stringUtils = new StringUtils();
        assertEquals(2, stringUtils.countOccurrences("hello", 'l'));
        assertEquals(0, stringUtils.countOccurrences("", 'a'));
        assertEquals(3, stringUtils.countOccurrences("banana", 'a'));
    }

    @Test
    void testCountOccurrencesWithNonexistentCharacter() {
        StringUtils stringUtils = new StringUtils();
        assertEquals(0, stringUtils.countOccurrences("hello", 'z'));
    }

}
