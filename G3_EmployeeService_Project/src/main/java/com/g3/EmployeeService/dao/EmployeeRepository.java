package com.g3.EmployeeService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g3.EmployeeService.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);
	
	List<Employee> findAllByOrderByFirstNameAsc();
	
	List<Employee> findAllByOrderByFirstNameDesc();

	
	
}
