package com.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.entities.Employee;
import com.springboot.service.EmployeeService;

@RestController // Marks this class as a REST controller
public class Controller {

	// Injects EmployeeService dependency
	@Autowired 
	EmployeeService empService;

	// Maps GET requests to /home
	@GetMapping("/home") 
	public String home() {
		return "This is Home Page";
	}

	// Maps GET requests to /home/employees
	@GetMapping("/home/employees") 
	public List<Employee> getEmployees() {
		return empService.getEmployees(); // Returns all employees
	}

	// Maps GET requests to /home/employee/{id}
	@GetMapping("/home/employee/{id}") 
	public Employee getEmployee(@PathVariable int id) {
		return empService.getEmployee(id); // Returns employee by ID
	}

	// Maps POST requests to /home/employees
	@PostMapping("/home/employees") 
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		// Adds a new employee
		Employee employee = empService.addEmployee(emp); 
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED); // Returns created employee with 201 status
	}

	// Maps PUT requests to /home/employee/{id}
	@PutMapping("/home/employee/{id}") 
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empService.updateEmployee(emp); // Updates an existing employee
	}

	// Maps DELETE requests to /home/employee/{id}
	@DeleteMapping("/home/employee/{id}") 
	public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
		try {
			empService.deleteEmployee(id); // Deletes employee by ID
			return new ResponseEntity<>(HttpStatus.OK); // Returns 200 status on success
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Returns 500 status on error
		}
	}
}