package com.app.nagu.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.nagu.entity.Book;
import com.app.nagu.repo.BookRepository;

@Component
public class TestBookRunner implements CommandLineRunner 
{
	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception 
	{
		repo.saveAll(
				Arrays.asList(
						new Book(101, "SBMS", "RAGHU", 300.0, "Backend"),
						new Book(102, "CORE", "RAGHU", 200.0, "Backend"),
						new Book(103, "ADV", "ASHOK", 400.0, "Backend"),
						new Book(104, "REACT", null, 500.0, "Frontend"),
						new Book(105, "HTML", "RAGHU", 600.0, "Frontend"),
						new Book(106, "CSS", null, 300.0, "Frontend"),
						new Book(107, "ANGULAR", "ASHOK", 800.0, "Frontend"),
						new Book(108, "SQL", "RAGHU", 200.0, "Database")
						)
				);
		
		Optional<Book> book = repo.findById(103);
		if(book.isPresent()) {
			System.out.println(book.get());
		}
		else {
			System.out.println("Data Not Found");
		}
		
		repo.getBookByAuthor("raghu").forEach(System.out::println);

		repo.getBookByAuthorAndPrice("r%",500.00,"backend").forEach(System.out::println);
		
		repo.getBookByIds(Arrays.asList(101,103,107)).forEach(System.out::println);
	}

}
