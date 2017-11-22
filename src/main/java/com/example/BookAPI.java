package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.DataLoader;

	@SpringBootApplication
	public class BookAPI {

		@Autowired
		private DataLoader dataLoader;
		
		
		public static void main(String[] args) {
			SpringApplication.run(BookAPI.class, args);
		}
		
	}

