package com.app.nagu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producttab")
public class Product 
{
	@Id
	@Column(name = "pid")
	private Integer prodId;
	
	@Column(name = "pcode")
	private String prodCode;
	
	@OneToMany
	@JoinColumn(name = "pidFk")
	List<Model> mobs;
}
