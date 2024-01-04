package com.Assesment.test;

public class EmailValidator 
{
	public boolean isValidEmail(String email)
	{
		 // Validates whether the provided email address is valid
		 // Example: isValidEmail("user@example.com") -> true
		 // isValidEmail("invalid_email") -> false
		 // Implement a simple validation logic for demonstration purposes
		 return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
	}
	public boolean isCorporateEmail(String email) 
	{
		 // Checks if the provided email address is a corporate email (ends with a specific domain)
		 // Example: isCorporateEmail("user@example.com") -> false
		 // isCorporateEmail("employee@company.com") -> true
		 return email != null && email.endsWith("company.com");
	}
	public boolean hasValidLength(String email) 
	 {
       // Checks if the length of the email address is within a reasonable range
       // Example: hasValidLength("user@example.com") -> true
       // hasValidLength("a@b.c") -> false
       return email != null && email.length() >= 6 && email.length() <= 255;
     }
	 public boolean hasNoSpecialCharacters(String email) 
	 {
	        // Checks if the email address does not contain any special characters
	        // Example: hasNoSpecialCharacters("user@example.com") -> true
	        // hasNoSpecialCharacters("user#example.com") -> false
	        return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") &&
	               !email.matches(".*[!#$%^&*(),?\":{}|<>].*");
	 }
}
