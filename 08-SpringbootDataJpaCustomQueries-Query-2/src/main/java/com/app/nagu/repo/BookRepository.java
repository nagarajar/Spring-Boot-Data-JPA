package com.app.nagu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.nagu.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>
{
	//SQL 1: select * from booktab where author=?
	//@Query("select b from Book b where bookAuthor = ?1")
	//@Query("select b from Book b where bookAuthor = :bookAuthor")
	//List<Book> getBookByAuthor(String bookAuthor);
	@Query("select b from Book b where bookAuthor = :abc")
	List<Book> getBookByAuthor(@Param("abc") String bookAuthor);
	
	
	//SQL 2: select * from booktab where author like ? or bprice > ?
	//@Query("select b from Book b where b.bookAuthor like ?1 OR b.bookPrice > ?2 OR b.bookType = ?3")
	@Query("select b from Book b where b.bookAuthor like :bookAuthor OR b.bookPrice > :bookPrice OR b.bookType = :bookType")
	List<Book> getBookByAuthorAndPrice(String bookAuthor, Double bookPrice, String bookType);
	
	
	//SQL: select * from booktab where bid in (?,?,?)
	//@Query("select b from Book b where bookId in (?1)")
	@Query("select b from Book b where bookId in (:inputs)")
	List<Book> getBookByIds(List<Integer> inputs);
}
