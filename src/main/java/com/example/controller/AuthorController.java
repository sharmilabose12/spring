package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Author;
import com.example.repository.AuthorRepository;
import com.example.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	private AuthorService authorService;
	
	@Autowired
	public AuthorController(AuthorService authorService){
		this.authorService =  authorService;
	}



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<Author> list(){
		return authorService.find();
	}
	

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Author read(@PathVariable (value="id") long id){

		return authorService.findOne(id);

	}
}
