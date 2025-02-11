package com.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> list = new ArrayList<>(Arrays.asList(new Employee(1, "Justin", "DevOps Engi"),
			new Employee(2, "Charlie", "Backend Dev"), new Employee(3, "John", "Java Dev")));

	@Override
	public List<Employee> getEmployees() {
		return list;
	}

	@Override
	public Employee getEmployee(int id) {
		for (Employee emp : list) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		list.add(emp);

		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		for (Employee e : list) {
			if (e.getId() == emp.getId()) {
				e.setId(emp.getId());
				e.setName(emp.getName());
				e.setJob(emp.getJob());
			}
		}

		return emp;
	}

	@Override
	public Employee deleteEmployee(int id) {
		for (Employee e : list) {
			if (e.getId() == id) {
				list.remove(e);
				return e;
			}
		}
		return null;
	}

}
