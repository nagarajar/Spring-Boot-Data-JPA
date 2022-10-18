package com.app.nagu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.nagu.entity.User;
import com.app.nagu.repo.UserRepository;

@Component
public class TestUserRunner implements CommandLineRunner {

	@Autowired
	private UserRepository repo;
	
	public void run(String... args) throws Exception 
	{
		User user = new User();
		
		user.setUserId(101);
		user.setUserName("nagarajar");
		user.setRoles(Arrays.asList("ADMIN","MANAGER","TEAMLEAD"));
		
		repo.save(user);

	}

}
