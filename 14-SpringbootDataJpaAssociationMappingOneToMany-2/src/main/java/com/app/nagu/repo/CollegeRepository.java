package com.app.nagu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nagu.entity.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {

}
