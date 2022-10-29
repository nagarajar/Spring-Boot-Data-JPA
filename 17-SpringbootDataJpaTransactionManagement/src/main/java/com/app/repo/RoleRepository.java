package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> 
{
	@Transactional //we need to define on top of service layer
	@Modifying
	@Query("update Role set roleCode=:roleCode where roleId=:id")
	int updateRoleById(Integer id, String roleCode);
	
	
}
