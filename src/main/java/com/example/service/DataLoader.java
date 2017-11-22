package com.example.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.domain.Author;
import com.example.domain.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;

@Service
//@ComponentScan("com.example.repository")
public class DataLoader {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	/*@Autowired
	public DataLoader(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}
	*/
	@PostConstruct
	private void loadData() {
		
		//Create author
		Author au = new Author("Sharmila", "Bose");
		authorRepository.save(au);
		
		Book book1 = new Book("Spring Boot");
		book1.setPublishedOn(new Date());
		book1.setAuthor(au);
		bookRepository.save(book1);
		
		Book book2 = new Book("Spring REST API");
		book2.setPublishedOn(new Date());
		book2.setAuthor(au);
		bookRepository.save(book2);
	}
	
}
