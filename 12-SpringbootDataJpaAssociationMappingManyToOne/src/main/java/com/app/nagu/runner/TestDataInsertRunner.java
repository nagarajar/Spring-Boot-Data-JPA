package com.app.nagu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.nagu.entity.Department;
import com.app.nagu.entity.Employee;
import com.app.nagu.repo.DepartmentRepository;
import com.app.nagu.repo.EmployeeRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner 
{
	@Autowired
	private EmployeeRepository erepo;
	
	@Autowired
	private DepartmentRepository drepo;
	
	
	public void run(String... args) throws Exception 
	{
		Department d1 = new Department(1054, "DEV", "Ajay");
		drepo.save(d1);
		

		Employee e1 = new Employee(10, "SAM", 500.0, d1);
		Employee e2 = new Employee(11, "RAM", 600.0, d1);
		Employee e3 = new Employee(12, "SYED", 700.0, d1);
		erepo.saveAll(Arrays.asList(e1,e2,e3));

	}

}
