package com.app.nagu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nagu.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>
{
	
}
