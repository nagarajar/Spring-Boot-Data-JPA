package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
	/***
	 * Output findBy<Variable><condition>(DataType param);
	 * VariableName can be follows same case or camelCase. 
	 */
	
	//SQL: SELECT * FROM BOOK WHERE AUTHOR=?
//	List<Book> findBybookAuthor(String bookAuthor);
	List<Book> findByBookAuthor(String bookAuthor);
	List<Book> findByBookAuthorIs(String bookAuthor);
	List<Book> findByBookAuthorEquals(String bookAuthor);
	
	//SQL: SELECT * FROM BOOK WHERE BOOKTYPE=?
	//invalid: findBybtype, findbybooktype, findbookbytype
	//valid : findBybookType, findByBookType
	List<Book> findByBookType(String bookType);
	

}
