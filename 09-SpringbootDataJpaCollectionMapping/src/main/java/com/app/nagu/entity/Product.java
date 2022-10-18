package com.app.nagu.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "prodtab")
public class Product 
{
	@Id
	@Column(name = "pid")
	private Integer prodId;
	@Column(name = "pcode")
	private String prodCode;
	
	@ElementCollection//must
	@CollectionTable(
			name = "product_colors",//table name
			joinColumns = @JoinColumn(name = "pidFk")// Fk column name
			)
	@OrderColumn(name = "pos")//index column name
	@Column(name = "colors")
	private List<String> colors;
	
	@ElementCollection
	@CollectionTable(
			name = "product_models",
			joinColumns = @JoinColumn(name = "pidFk")
			)
	@Column(name = "models")
	private Set<String> models;
	
	@ElementCollection
	@CollectionTable(
			name = "product_details",
			joinColumns = @JoinColumn(name = "pidFk")
			)
	@MapKeyColumn(name = "code")
	@Column(name = "details")
	private Map<String, String> details;
}
