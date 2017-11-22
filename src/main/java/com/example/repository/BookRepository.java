package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.domain.Book;


public interface BookRepository extends CrudRepository<Book, Long> {

}
