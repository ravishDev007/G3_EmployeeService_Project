package com.g3.EmployeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g3.EmployeeService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
