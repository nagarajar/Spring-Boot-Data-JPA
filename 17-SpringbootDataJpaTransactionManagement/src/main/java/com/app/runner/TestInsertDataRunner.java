package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Role;
import com.app.entity.User;
import com.app.repo.RoleRepository;
import com.app.repo.UserRepository;

@Component
public class TestInsertDataRunner implements CommandLineRunner {

	@Autowired
	private RoleRepository rrepo;
	
	@Autowired
	private UserRepository urepo;
	
	public void run(String... args) throws Exception {
		Role r1 = new Role(503, "ADMIN");
		Role r2 = new Role(504, "GUEST");
		Role r3 = new Role(505, "MANAGER");
		Role r4 = new Role(506, "TEAMLEAD");
		Role r5 = new Role(507, "SUPPORTADMIN");
		
		rrepo.saveAll(Arrays.asList(r1,r2,r3,r4,r5));
		
		User u1 = new User(10, "SYED", r1);
		User u2 = new User(11, "SAM", r2);
		User u3 = new User(12, "RAM", r3);
		User u4 = new User(13, "TOM", r4);
		User u5 = new User(14, "ANU", r5);
		
		urepo.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
		
		rrepo.findAll().forEach(System.out::println);
		urepo.findAll().forEach(System.out::println);
		
		System.out.println("****************************************");
		int count = rrepo.updateRoleById(504, "JOINER");
		System.out.println("No-of rows affected : "+count);
		System.out.println(rrepo.findById(504));
				
		System.out.println("****************************************");
		
		System.out.println("****************************************");
		int count2 = urepo.removeById(11);
		System.out.println("No-of rows affected : "+count2);
		urepo.findAll().forEach(System.out::println);
		
		System.out.println("****************************************");
		
	}

}
