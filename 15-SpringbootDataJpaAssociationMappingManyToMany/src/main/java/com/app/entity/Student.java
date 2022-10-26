package com.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studenttab")
public class Student 
{
	@Id
	@Column(name = "sid")
	private Integer studentId;
	@Column(name = "sname")
	private String studentName;
	@Column(name = "semail")
	private String studentEmail;
	
	@ManyToMany
	@JoinTable(
			name = "stdcrstab",
			joinColumns = @JoinColumn(name = "sidFk"),
			inverseJoinColumns = @JoinColumn(name = "cidFk")
			)
	private List<Course> cobs;
	
}

