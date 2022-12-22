package com.track.convertor;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


import com.track.dto.CandidateDTO;
import com.track.dto.EmployeeDTO;
import com.track.dto.InterviewScheduleDTO;

import com.track.entity.Candidate;
import com.track.entity.Employee;
import com.track.entity.InterviewSchedule;

@Component
public class Convertor {

	//Candidate
	public static Candidate convertToCandidateEntity(CandidateDTO candidateDTO) {
		
		Candidate candidate=new Candidate();
		BeanUtils.copyProperties(candidateDTO, candidate);
		return candidate;
	}
	
	public static CandidateDTO convertToCandidateDTO(Candidate candidate) {
		
		CandidateDTO candidateDTO=new CandidateDTO();
		BeanUtils.copyProperties(candidate, candidateDTO);
		return candidateDTO;
	} 
	
	
	
	//Employee
	public static Employee convertorToEmployeeEntity(EmployeeDTO employeeDTO) {
		Employee employee=new Employee();
		BeanUtils.copyProperties(employeeDTO, employee);
		return employee;
	}
	
	public static EmployeeDTO convertorToEmployeeDTO(Employee employee) {
		EmployeeDTO employeeDTO=new EmployeeDTO();
		BeanUtils.copyProperties(employee, employeeDTO);
		return employeeDTO;
	}
	
	
	//InterviewSchedule
	public static InterviewSchedule convertorToInterviewScheduleEntity(InterviewScheduleDTO interviewSchdueleDTO) {
		InterviewSchedule interviewSchedule=new InterviewSchedule();
		BeanUtils.copyProperties(interviewSchdueleDTO, interviewSchedule);
		return interviewSchedule;
		
	}
	
	public static InterviewScheduleDTO convertorToInterviewScheduleDTO(InterviewSchedule interviewSchedule) {
		InterviewScheduleDTO interviewScheduleDTO=new InterviewScheduleDTO();
		BeanUtils.copyProperties(interviewSchedule, interviewScheduleDTO);
		return interviewScheduleDTO;
	}
	
}
