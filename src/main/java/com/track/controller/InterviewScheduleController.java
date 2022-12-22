package com.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.track.entity.InterviewSchedule;
import com.track.exception.InterviewScheduleNotFoundException;
import com.track.service.InterviewScheduleService;

@RestController
@CrossOrigin(origins="http://localhost",maxAge=3600)
public class InterviewScheduleController {
	
	@Autowired
	private InterviewScheduleService interviewScheduleService;
	
	@PostMapping(value="/add interview")
	public InterviewSchedule scheduleCandidateInterview(@RequestBody  InterviewSchedule interviewSchedule) {
		return interviewScheduleService.scheduleCandidateInterview(interviewSchedule);
	}
	
	@PutMapping(value="/update interview")
	public InterviewSchedule updateCandidateInterviewSchedule(@RequestBody InterviewSchedule interviewSchedule) {
		return interviewScheduleService.updateCandidateInterviewSchedule(interviewSchedule);
	}
	
	@DeleteMapping(value="/delete interview/{id}")
	public InterviewSchedule cancelCandidateInterviewSchedule(@PathVariable("id") int interviewScheduleID)throws InterviewScheduleNotFoundException {
		
	
	return interviewScheduleService.cancelCandidateInterviewSchedule(interviewScheduleID);
	}
	@GetMapping(value="/viewinterviews")
	public List<InterviewSchedule>viewallinterviews(){
		return interviewScheduleService.viewallinterview();
	}

}
