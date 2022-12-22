package com.track.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.track.entity.InterviewSchedule;
import com.track.exception.InterviewScheduleNotFoundException;
import com.track.repository.InterviewScheduleRepository;
import com.track.service.InterviewScheduleService;

@Service
public class InterviewScheduleServiceImpl implements InterviewScheduleService {

	
	@Autowired
	private InterviewScheduleRepository interviewScheduleRepo;

	@Override
	public InterviewSchedule scheduleCandidateInterview(InterviewSchedule interviewSchedule) {
		// TODO Auto-generated method stub
		return interviewScheduleRepo.save(interviewSchedule);
		
	}

	@Override
	public InterviewSchedule updateCandidateInterviewSchedule(InterviewSchedule interviewSchedule) {
		// TODO Auto-generated method stub
		return interviewScheduleRepo.save(interviewSchedule);
	}

	@Override
	public InterviewSchedule cancelCandidateInterviewSchedule(int interviewScheduleID)
			throws InterviewScheduleNotFoundException {
		// TODO Auto-generated method stub
		Optional<InterviewSchedule>interviewSchedule=interviewScheduleRepo.findById(interviewScheduleID);
		
		InterviewSchedule interview=new InterviewSchedule();
		if(interviewSchedule.isPresent()) {
			interviewScheduleRepo.deleteById(interviewScheduleID);;
			interview=interviewSchedule.get();
		}
		else {
			throw new InterviewScheduleNotFoundException("No such interview");
			
		}
		
		return interview;
	}

	
	@Override
	public List<InterviewSchedule> viewallinterview() {
		// TODO Auto-generated method stub
		return interviewScheduleRepo.findAll();
	}

	

	
}
