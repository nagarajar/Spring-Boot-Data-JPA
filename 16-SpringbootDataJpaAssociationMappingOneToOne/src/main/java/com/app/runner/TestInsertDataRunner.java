package com.app.runner;

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
		
		rrepo.save(r1);
		rrepo.save(r2);
		
		User u1 = new User(10, "SYED", r1);
		User u2 = new User(11, "SAM", r2);
		
		urepo.save(u1);
		urepo.save(u2);
		
		rrepo.findAll().forEach(System.out::println);
		urepo.findAll().forEach(System.out::println);
		
	}

}
