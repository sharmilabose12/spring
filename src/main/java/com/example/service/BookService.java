package com.example.service;

import com.example.domain.Book;

public interface BookService {

	
	public Iterable<Book> list();
	
	public Book listOne(Long id);
	
	public Book save(Book book);
	
	public Book update(Long id, Book book);
	
	public void remove(Long id);
	
}
