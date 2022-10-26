package com.app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Course;
import com.app.entity.Student;
import com.app.repo.CourseRepository;
import com.app.repo.StudentRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner 
{
	@Autowired
	private CourseRepository crepo;
	
	@Autowired
	private StudentRepository srepo;
	
	public void run(String... args) throws Exception 
	{
		Course c1 = new Course(101, "JRTP", 7000.00);
		Course c2 = new Course(102, "SBMS", 7000.00);
		Course c3 = new Course(103, "ReactJs", 5000.00);
		Course c4 = new Course(104, "Angular", 5000.00);
		Course c5 = new Course(105, "AWS", 10000.00);
		Course c6 = new Course(106, "DevOps", 15000.00);
		
		Student s1 = new Student(10, "Nagaraja", "Nagaraja@gmail.com", Arrays.asList(c1,c2));
		Student s2 = new Student(11, "Kiran", "Kiran@gmail.com", Arrays.asList(c1,c2,c6));
		Student s3 = new Student(12, "Ankith", "Ankith@gmail.com", Arrays.asList(c1,c2,c3,c4));
		Student s4 = new Student(13, "Hari", "Hari@gmail.com", Arrays.asList(c1,c2,c5,c6));
		Student s5 = new Student(14, "Murali", "Murali@gmail.com", Arrays.asList(c1,c3,c6));
		Student s6 = new Student(15, "Sachin", "Sachin@gmail.com", Arrays.asList(c1,c2,c5));
		Student s7 = new Student(16, "Jagadish", "Jagadish@gmail.com", Arrays.asList(c1,c4,c6));

		crepo.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6));
		srepo.saveAll(Arrays.asList(s1,s2,s3,s4,s5,s6,s7));
	}

}
