package com.project.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.library.model.Book;
import com.project.library.repository.LibraryRepository;

@Service
public class LibraryImpl implements LibraryInt {

	@Autowired
	LibraryRepository libraryRepository;

	@Override
	public List<Book> retreiveAllBooks() {
		return libraryRepository.findAll();
	}

	@Override
	public Book retreiveBook(long Id) {
		return libraryRepository.findById(Id).orElse(null);
	}

	@Override
	public boolean addBook(Book book) {
		return libraryRepository.save(book)==null?false:true;
	}

	@Override
	public boolean updateBook(Book book) {
		return libraryRepository.updateBookByID(book.getBookTitle(),book.getAuthor(),book.getDescription(),book.getRackNo(), book.isBorrowed(),book.getMemberId(),book.getId())>0?true:false;
	}

	@Override
	public boolean deleteBook(long bookId) {
		try {
		libraryRepository.deleteById(bookId);
		return true;
		}
		catch (Exception e) {
			System.out.println("Exception while deleting"+ e.getStackTrace());
			return false;
		}
	}

}
