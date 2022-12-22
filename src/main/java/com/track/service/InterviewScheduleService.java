package com.track.service;


import java.util.List;

import com.track.entity.InterviewSchedule;
import com.track.exception.InterviewScheduleNotFoundException;

public interface InterviewScheduleService {

	public InterviewSchedule scheduleCandidateInterview(InterviewSchedule interviewSchedule);
	public InterviewSchedule updateCandidateInterviewSchedule(InterviewSchedule interviewSchedule);
	public InterviewSchedule cancelCandidateInterviewSchedule(int interviewScheduleID)throws InterviewScheduleNotFoundException;
	public List<InterviewSchedule>viewallinterview();
}
