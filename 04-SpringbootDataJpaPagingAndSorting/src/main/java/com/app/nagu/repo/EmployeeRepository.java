package com.app.nagu.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.nagu.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

}
