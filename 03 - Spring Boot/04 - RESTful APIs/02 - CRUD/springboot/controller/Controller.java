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

@RestController
public class Controller {

	@Autowired
	EmployeeService empService;

	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}

	@GetMapping("/home/employees")
	public List<Employee> getEmployees() {
		return empService.getEmployees();
	}

	@GetMapping("/home/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return empService.getEmployee(id);
	}

	@PostMapping("/home/employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		Employee employee = empService.addEmployee(emp);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}

	@PutMapping("/home/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empService.updateEmployee(emp);
	}

	@DeleteMapping("/home/employee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
		try {
			empService.deleteEmployee(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
