package com.app.nagu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.nagu.entity.Branch;
import com.app.nagu.entity.College;
import com.app.nagu.repo.BranchRepository;
import com.app.nagu.repo.CollegeRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner 
{
	@Autowired
	private CollegeRepository crepo;
	
	@Autowired
	private BranchRepository brepo;
	
	public void run(String... args) throws Exception 
	{
		Branch b1 = new Branch(101, "Mechanical Engineering", "ME");
		Branch b2 = new Branch(102, "Eletrical Engineering", "EE");
		Branch b3 = new Branch(103, "Computer Science Engineering", "CSE");
		Branch b4 = new Branch(104, "Electronic and Communication Engineering", "ECE");
		Branch b5 = new Branch(105, "Civil Engineering", "CE");
		Branch b6 = new Branch(106, "Information Technology", "IT");
		
		College c1 = new College(10, "Ramaiah Institute of Technology", "RIT", Arrays.asList(b1,b2,b3,b4,b5));
		College c2 = new College(11, "Nitte Meenakshi Institute of Technology", "NMIT", Arrays.asList(b1,b2,b3,b6));
		College c3 = new College(12, "Bangalore Institute of Technology", "BIT", Arrays.asList(b1,b2,b3,b6));
		
		brepo.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6));
		crepo.saveAll(Arrays.asList(c1,c2,c3));
		
	
	}

}
