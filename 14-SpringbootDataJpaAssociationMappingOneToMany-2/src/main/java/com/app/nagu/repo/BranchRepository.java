package com.app.nagu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nagu.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
