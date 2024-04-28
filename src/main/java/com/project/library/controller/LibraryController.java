package com.project.library.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.library.model.Book;
import com.project.library.service.LibraryImpl;

@RestController
public class LibraryController {
	
	@Autowired
	private LibraryImpl libraryImpl;

	//End-point to retrieve all books
	@GetMapping("/retrieveBooks")
	public List<Book> retrieveAllBooks(){
		return libraryImpl.retreiveAllBooks();
	}
	
	//End-point to retrieve book using id
	@GetMapping("/retrieveBook/{bookId}")
	public Book retreiveBook(@PathVariable("bookId") long bookId) {
		Book book = libraryImpl.retreiveBook(bookId);
		return book;
	}
	
	//End-point to add a new book
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book) {	
		return libraryImpl.addBook(book)?"Success":"failure";
	}
	
	//End-point to update a book table row
	@PutMapping("/updateBook")
	public String updateBook(@RequestBody Book book) {	
		return libraryImpl.updateBook(book)?"Success":"failure";
	}
	
	//End-point to delete a book row using id
	@DeleteMapping("/deleteBook/{bookId}")
	public String removeBook(@PathVariable("bookId") long bookId ) {	
		return libraryImpl.deleteBook(bookId)?"Success":"failure";
	}	
}
