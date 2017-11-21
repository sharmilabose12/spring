package com.example.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	//Books
	@OneToMany(mappedBy = "author")
	private java.util.List<Book> books;
	
	@SuppressWarnings("unused")
	private Author() {} // for JPA
	
	public Author (String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}

	public java.util.List<Book> getBooks() {
		return books;
	}

	public void setBooks(java.util.List<Book> books) {
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
