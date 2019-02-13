package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> findall();
	public Employee findEmployee(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);

}
