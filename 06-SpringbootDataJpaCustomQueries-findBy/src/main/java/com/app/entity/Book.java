package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "booktab")
public class Book 
{
	@Id
	@Column(name = "bid")
	private Integer bookId;
	
	@Column(name = "bname")
	private String bookName;
	
	@Column(name = "bauthor")
	private String bookAuthor;
	
	@Column(name = "bprice")
	private Double bookPrice;
	
	@Column(name = "btype")
	private String bookType;
}
