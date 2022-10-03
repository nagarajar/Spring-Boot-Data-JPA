package com.app.nagu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.app.nagu.entity.Employee;
import com.app.nagu.repo.EmployeeRepository;

@Component
public class TestDFetchDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
//		repo.findAll().forEach(System.out::println);
		
		//Input
		//Pageable p = PageRequest.of(42, 4); // Page number 44 not present so it return empty
		Pageable p = PageRequest.of(2, 4);
		
		//Output
		Page<Employee> page = repo.findAll(p);
		
		//Result
		page.getContent().forEach(System.out::println);
		
		//metadata
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		System.out.println(page.isEmpty());
		System.out.println(page.hasNext());
		System.out.println(page.hasPrevious());
		System.out.println(page.hasContent());
		System.out.println(page.getTotalPages());
		System.out.println(page.getTotalElements());
		System.out.println(page.getSize());

	}
}
