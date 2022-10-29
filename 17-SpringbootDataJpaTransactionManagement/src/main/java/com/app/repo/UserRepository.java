package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> 
{
	@Transactional
	@Modifying
	@Query("Delete User where userId=:id")
	int removeById(Integer id);
	
}
