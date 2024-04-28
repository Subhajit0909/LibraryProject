package com.project.library.service;

import java.util.List;

import com.project.library.model.Book;

public interface LibraryInt {

	public List<Book> retreiveAllBooks();
	
	public Book retreiveBook(long Id);
	
	public boolean addBook(Book book);
	
	public boolean updateBook(Book book);
	
	public boolean deleteBook(long bookId);
}
