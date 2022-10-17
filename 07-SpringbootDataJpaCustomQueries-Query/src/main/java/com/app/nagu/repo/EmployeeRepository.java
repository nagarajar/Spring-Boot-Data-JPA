package com.app.nagu.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.nagu.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
	//@Query("_________")
	//ReturnType  abstractMethodName(<Param>)
	/**
	 * This abstractMethodName can be any name...
	 * 
	 */
	
	//SQL: 1. fetch one column data
	//@Query("SELECT e.empName FROM Employee e")
	@Query("SELECT empName FROM Employee e")
	List<String> getAllEmpNames();
	
	//SQL: 2 select all columns
	//@Query("SELECT e FROM Employee e")
	@Query("FROM Employee e")
	List<Employee> fetchAllEmps();
	
	//SQL: 3 select multiple columns
	@Query("select e.empId,e.empName from Employee e")
	List<Object[]> fetchIdAndNames();
	
	//SQL:4 Fetch one column and one row data
	@Query("select e.empName from Employee e where e.empId=:id")
	Optional<String> getEmpNameById(Integer id);
	
	//SQL:5 fetch all columns and one row
	@Query("select e from Employee e where e.empId=:id")
	Optional<Employee> fetchEmpById(Integer id);
}
