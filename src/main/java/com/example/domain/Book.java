package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Book {

	private Long id;
	
	private String title;
	
	private Date publishedOn;
	
	//Author
	@ManyToOne
	private Author author;

	@SuppressWarnings("unused")
	private Book() {}// for JPA
	
	//Title is required when creating a book
	public Book (String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishedOn() {
		return publishedOn;
	}

	public void setPublishedOn(Date publishedOn) {
		this.publishedOn = publishedOn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
