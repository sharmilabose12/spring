package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Book;
import com.example.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public Iterable<Book> list(){
		return bookService.list();
	}
	
	@RequestMapping(value = "/" , method = RequestMethod.POST)
	public Book create(@RequestBody Book book) {
		return bookService.save(book);
	}
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public Book read(@PathVariable(value ="id") Long id) {
		return bookService.listOne(id);
	}
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.PUT)
	public Book update(@PathVariable(value ="id") Long id, @RequestBody Book book) {
		return bookService.update(id,book);
	}
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
	public void delete(@PathVariable(value ="id") Long id) {
		bookService.remove(id);
	}
}
