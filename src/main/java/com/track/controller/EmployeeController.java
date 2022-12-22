package com.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.track.entity.Employee;
import com.track.service.EmployeeService;



@RestController
@CrossOrigin(origins="http://localhost",maxAge=3600)
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value="/register")
	public Employee registerEmployee(@RequestBody  Employee employee) {
		return employeeService.registerEmployee(employee);
		
	}
	
	@GetMapping(value="/view/{id}")
	public Employee searchEmployee(@PathVariable("id")int userID) {
		return employeeService.searchEmployee(userID);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public Employee deleteEmployee(@PathVariable("id")int userID) {
		return employeeService.deleteEmployee(userID);
	}

	@GetMapping(value="/getAll")
	public List<Employee>viewallemployees(){
		return employeeService.viewallemployees();
	}
	
}
