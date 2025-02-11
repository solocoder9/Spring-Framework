package com.springboot.service;

import java.util.List;

import com.springboot.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public Employee getEmployee(int id);

	public Employee addEmployee(Employee emp);

	public Employee updateEmployee(Employee emp);

	public Employee deleteEmployee(int id);
}
