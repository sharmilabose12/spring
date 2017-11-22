package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Author;
import com.example.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{

	private AuthorRepository authorRepository;
	
	@Autowired
	public AuthorServiceImpl(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@Override
	public Iterable<Author> find(){
		return authorRepository.findAll();
	}
	
	@Override
	public Author findOne(Long id) {
		return authorRepository.findOne(id);
		
	}
}
	
