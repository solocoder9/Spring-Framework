package com.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.entities.Employee;
import com.springboot.repository.EmployeeRepository;

@Service // Marks this class as a service layer component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired // Injects the EmployeeRepository dependency
	EmployeeRepository employeeRepository;
	
	@Override
	// Retrieves a list of all employees
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	// Retrieves a single employee by their ID
	public Employee getEmployee(int id) {
		Employee emp = employeeRepository.findById(id).get();
		return emp;
	}

	@Override
	// Adds a new employee to the database
	public Employee addEmployee(Employee emp) {
		employeeRepository.save(emp);
		return emp;
	}

	@Override
	// Updates an existing employee in the database
	public Employee updateEmployee(Employee emp) {
		employeeRepository.save(emp);
		return emp;
	}

	@Override
	// Deletes an employee by their ID
	public void deleteEmployee(int id) {
		employeeRepository.delete(employeeRepository.findById(id).get());
	}
}