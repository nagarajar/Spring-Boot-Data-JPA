package com.app.nagu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nagu.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
