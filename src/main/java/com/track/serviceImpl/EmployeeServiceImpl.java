package com.track.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.track.entity.Employee;
import com.track.exception.EmployeeNotFoundException;
import com.track.repository.EmployeeRepository;
import com.track.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public Employee registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee searchEmployee(int userID)throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Optional<Employee>employee=employeeRepo.findById(userID);
		Employee employ=null;
		if(employee.isPresent())
		{
			employ=employee.get();
		}
		else {
			throw new EmployeeNotFoundException("no such employee");
		}
		return employ;
	}

	@Override
	public Employee deleteEmployee(int userID)throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Optional<Employee>employee=employeeRepo.findById(userID);
		Employee employ=null;
		if(employee.isPresent()) {
			employeeRepo.deleteById(userID);
			employ=employee.get();
		}
		else {
			throw new EmployeeNotFoundException("No such employee");
		}
		return employ;
	}

	@Override
	public List<Employee> viewallemployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}
	


}
