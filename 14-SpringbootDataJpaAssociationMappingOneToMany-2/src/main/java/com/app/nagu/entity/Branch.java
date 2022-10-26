package com.app.nagu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "branchtab")
public class Branch 
{
	@Id
	@Column(name = "bid")
	private Integer branchId;
	@Column(name = "bname")
	private String branchName;
	@Column(name = "bcode")
	private String branchCode;
}
