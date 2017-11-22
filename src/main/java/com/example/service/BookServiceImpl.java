package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private AuthorRepository authorRepository;
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(AuthorRepository authorRepository, BookRepository bookRepository) {
			this.authorRepository = authorRepository;
			this.bookRepository = bookRepository;
		}
	
	@Override
	public Iterable<Book> list(){	
		return bookRepository.findAll();
}
	
	@Override
	public Book listOne(Long id) {
		return bookRepository.findOne(id);
	}
	
	@Override
	public Book save(Book book) {
		authorRepository.save(book.getAuthor());
		return bookRepository.save(book);
	}
	
	@Override
	public Book update(Long id, Book book) {
		Book b = bookRepository.findOne(id);
		if(b.getTitle()!= null) {
			b.setTitle(book.getTitle());
		}
		
		return bookRepository.save(b);
	}
	
	@Override
	public void remove(Long id) {
		bookRepository.delete(id);
	}
}
