package com.Assesment.test;

import java.util.ArrayList;
import java.util.List;

public class Library 
{
	private List<Book> books;
	 public Library() {
	 this.books = new ArrayList<>();
	 }
	 public void addBook(Book book) {
	 books.add(book);
	 }
	 public List<Book> getBooks() {
	 return new ArrayList<>(books);
	 }
	 public void borrowBook(String title) {
	 for (Book book : books) {
	 if (book.getTitle().equals(title) && book.isAvailable()) {
	 book.setAvailable(false);
	 return;
	 }
	 }
	 }
	 public void returnBook(String title) {
	 for (Book book : books) {
	 if (book.getTitle().equals(title) && !book.isAvailable()) {
	 book.setAvailable(true);
	 return;
	 }
	 }
	 }
}
