package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.domain.Author;


public interface AuthorRepository extends CrudRepository<Author, Long> {

}
