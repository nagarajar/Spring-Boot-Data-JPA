package com.app.nagu.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usertab")
public class User 
{
	@Id
	@Column(name = "uid")
	private Integer userId;
	@Column(name = "uname")
	private String userName;
	
	@ElementCollection
	@CollectionTable(
			name = "user_roles",
			joinColumns = @JoinColumn(name="uidFk")
			)
	@OrderColumn(name="pos")
	@Column(name = "roles")
	private List<String> roles;
}
