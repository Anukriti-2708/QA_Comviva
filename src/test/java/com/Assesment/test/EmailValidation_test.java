package com.Assesment.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmailValidation_test 
{
	    @Test
	    void testIsValidEmail() {
	        EmailValidator validator = new EmailValidator();
	        assertTrue(validator.isValidEmail("user@example.com"));
	        assertFalse(validator.isValidEmail("invalid_email"));
	        assertFalse(validator.isValidEmail(null));
	    }

	    @Test
	    void testIsCorporateEmail() {
	        EmailValidator validator = new EmailValidator();
	        assertFalse(validator.isCorporateEmail("user@example.com"));
	        assertTrue(validator.isCorporateEmail("employee@company.com"));
	        assertFalse(validator.isCorporateEmail(null));
	    }

	    @Test
	    void testHasValidLength() {
	        EmailValidator validator = new EmailValidator();
	        assertTrue(validator.hasValidLength("user@example.com"));
	        assertFalse(validator.hasValidLength("a@b.c"));
	        assertFalse(validator.hasValidLength(null));
	    }

	    @Test
	    void testHasNoSpecialCharacters() {
	        EmailValidator validator = new EmailValidator();
	        assertTrue(validator.hasNoSpecialCharacters("user@example.com"));
	        assertFalse(validator.hasNoSpecialCharacters("user#example.com"));
	        assertFalse(validator.hasNoSpecialCharacters(null));
	    }
	}



