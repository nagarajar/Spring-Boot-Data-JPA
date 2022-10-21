package com.app.nagu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nagu.entity.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {

}
