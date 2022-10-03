package com.app.nagu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.nagu.entity.Employee;
import com.app.nagu.repo.EmployeeRepository;

//@Component
public class TestASaveRunner implements CommandLineRunner 
{
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(
				Arrays.asList(
						new Employee(10,"ABC",200.0,"DEV"),
						new Employee(11,"XYZ",300.0,"QA"),
						new Employee(12,"CDF",400.0,"BA"),
						new Employee(13,"UVW",500.0,"QA"),
						new Employee(14,"JKL",300.0,"BA"),
						new Employee(15,"MNO",200.0,"DEV"),
						new Employee(16,"PQR",700.0,"DEV"),
						new Employee(17,"CDE",600.0,"BA"),
						new Employee(18,"AXS",500.0,"QA"),
						new Employee(19,"GVD",800.0,"DEV"),
						new Employee(20,"HLK",100.0,"BA")
						));
		
	}

}
