package com.example.service;

import com.example.domain.Author;

public interface AuthorService {

	
	public Iterable<Author> find();
	
	public Author findOne(Long id);
}
