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
@Table(name = "collegetab")
public class College 
{
	@Id
	@Column(name = "cid")
	private Integer collegeId;
	@Column(name = "cname")
	private String collegeName;
	@Column(name = "ccode")
	private String collegeCode;
	
	@OneToMany
	@JoinColumn(name = "cidfk")
	private List<Branch> branches;
}
