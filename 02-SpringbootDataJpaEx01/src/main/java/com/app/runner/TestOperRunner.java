package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Student;
import com.app.repo.StudentRepository;

@Component
public class TestOperRunner implements CommandLineRunner 
{
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println(repo.getClass().getName());
		
		Student sob = new Student();
		sob.setStdId(10);
		sob.setStdName("Naveen");
		sob.setStdFee(10000.0);
		
		repo.save(sob); //INSERT OR UPDATE
	}

}
