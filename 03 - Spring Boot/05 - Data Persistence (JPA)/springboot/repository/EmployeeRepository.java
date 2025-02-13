package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.entities.Employee;

// Repository interface for Employee entity
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// Inherits CRUD operations from JpaRepository
}