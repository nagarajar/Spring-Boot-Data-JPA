package com.app.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Book;
import com.app.repo.BookRepository;

@Component
public class TestDataRunner implements CommandLineRunner 
{
	@Autowired
	private BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(
				Arrays.asList(
						new Book(101, "SBMS", "RAGHU", 300.0, "Backend"),
						new Book(102, "CORE", "RAGHU", 200.0, "Backend"),
						new Book(103, "ADV", "ASHOK", 400.0, "Backend"),
						new Book(104, "REACT", "ASHOK", 500.0, "Frontend"),
						new Book(105, "HTML", "RAGHU", 600.0, "Frontend"),
						new Book(106, "CSS", null, 300.0, "Frontend"),
						new Book(107, "ANGULAR", "ASHOK", 800.0, "Frontend"),
						new Book(108, "SQL", "RAGHU", 200.0, "Database")
						)
				);
		
//		repo.findByBookAuthor("raghu")
//		repo.findByBookAuthorIs("ASHOK")
		repo.findByBookAuthorEquals("ASHOK")
		.forEach(System.out::println);
		
		repo.findByBookType("Backend")
		.forEach(System.out::println);
		
		repo.findByBookPriceLessThanEqual(500.0)
		.forEach(System.out::println);
		
		repo.findByBookIdNot(101)
		.forEach(System.out::println);
		
		repo.findByBookPriceEquals(300.0)
		.forEach(System.out::println);
		
		repo.findByBookPriceGreaterThan(500.0)
		.forEach(System.out::println);
		
		repo.findByBookAuthorIsNull()
		.forEach(System.out::println);
		
//		repo.findByBookAuthorIsNotNull()
		repo.findByBookAuthorNotNull()
		.forEach(System.out::println);
		
		repo.findByBookAuthorLike("A%")
		.forEach(System.out::println);
		
		repo.findByBookAuthorLikeOrderByBookNameDesc("A%")
		.forEach(System.out::println);
	
		repo.findByBookAuthorNotLike("A%")
		.forEach(System.out::println);

		repo.findByBookAuthorStartingWith("A")
		.forEach(System.out::println);
	
		repo.findByBookAuthorEndingWith("u")
		.forEach(System.out::println);
	
		repo.findByBookAuthorContaining("u")
		.forEach(System.out::println);
	
		repo.findByBookIdBetween(101, 105)
		.forEach(System.out::println);
	
		repo.findByBookIdLessThanEqualOrBookTypeLike(104,"Front%")
		.forEach(System.out::println);
	
		repo.findByBookPriceNotAndBookAuthorNotLike(300.0,"Front%")
		.forEach(System.out::println);
		
		Optional<Book> opt = repo.findByBookIdIs(1041);
		if(opt.isPresent())
		{
			System.out.println(opt.get());
		}
		else
		{
			System.out.println("No Data Found");
		}
	
	}
}
