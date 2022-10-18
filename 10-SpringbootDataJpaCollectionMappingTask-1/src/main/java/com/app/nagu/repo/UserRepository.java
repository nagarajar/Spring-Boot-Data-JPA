package com.app.nagu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nagu.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
