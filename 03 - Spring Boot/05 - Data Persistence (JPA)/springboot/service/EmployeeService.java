package com.springboot.service;

import java.util.List;
import com.springboot.entities.Employee;

public interface EmployeeService {

	// Retrieve a list of all employees
	public List<Employee> getEmployees();

	// Retrieve a single employee by their ID
	public Employee getEmployee(int id);

	// Add a new employee
	public Employee addEmployee(Employee emp);

	// Update an existing employee
	public Employee updateEmployee(Employee emp);

	// Delete an employee by their ID
	public void deleteEmployee(int id);
}