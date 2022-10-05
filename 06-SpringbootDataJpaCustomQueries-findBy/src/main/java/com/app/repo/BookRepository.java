package com.app.repo;

import java.util.List;
import java.util.Optional;

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
	

	//findBy -->SELECT + where = !=, > < null, not null, and or...
	//SQL: select * from book where book_price=? 
	List<Book> findByBookPriceLessThanEqual(Double bookPrice);
	
	//SQL: select * from book where book_id!=? 
	List<Book> findByBookIdNot(Integer bookId);
	
	//SQL: select * from book where price = ? 
	List<Book> findByBookPriceEquals(Double bookPrice);
	
	//SQL: select * from book where price >= ? 
	List<Book> findByBookPriceGreaterThan(Double bookPrice);
	

	//SQL: select * from book where author is null 
	List<Book> findByBookAuthorIsNull();
	
	//SQL: select * from book where author is not null 
	List<Book> findByBookAuthorIsNotNull();
	List<Book> findByBookAuthorNotNull();
	
	//------------Like Operator---------------------
	//SQL: Select * from book where author like ?
	List<Book> findByBookAuthorLike(String expression);
	
	//SQL: Select * from book where author like ? order by bookname DESC
	List<Book> findByBookAuthorLikeOrderByBookNameDesc(String expression);
	

	//SQL: Select * from book where author not like ?
	List<Book> findByBookAuthorNotLike(String expression);
	
	//SQL: Select * from book where author like 'input%'
	List<Book> findByBookAuthorStartingWith(String expression);
	
	//SQL: Select * from book where author like '%input'
	List<Book> findByBookAuthorEndingWith(String expression);
	
	//SQL: Select * from book where author like '%input%'
	List<Book> findByBookAuthorContaining(String expression);
	
	//SQL: Select * from book where bid between x and y
	List<Book> findByBookIdBetween(Integer id1, Integer id2);
	
	//--------------AND / OR --------------------------
	//SQL: select * from book where bookId <= ? or bookType like ?
	List<Book> findByBookIdLessThanEqualOrBookTypeLike(Integer bookId, String input);
	
	//SQL: select * from book where bookcost != ? and author not like ?
	List<Book> findByBookPriceNotAndBookAuthorNotLike(Double price, String author);
	

	//-------------single row-----------------------------
	Optional<Book> findByBookIdIs(Integer id);
	
	
	
	
	
	
	
	

}
