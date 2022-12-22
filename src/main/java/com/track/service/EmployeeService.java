package com.track.service;

import java.util.List;

import com.track.entity.Employee;
import com.track.exception.EmployeeNotFoundException;

public interface EmployeeService {

	public Employee registerEmployee(Employee employee);
	public Employee searchEmployee(int userID)throws EmployeeNotFoundException;
	public Employee deleteEmployee(int userID)throws EmployeeNotFoundException;
	public List<Employee>viewallemployees(); 
}
