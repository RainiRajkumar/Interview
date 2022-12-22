package com.track.dto;

import java.time.LocalDateTime;

import com.track.entity.Candidate;
import com.track.entity.Employee;

public class InterviewScheduleDTO {
	
	private int interviewScheduleID;
	
	private float techRating;
	
	private float hrRating;
	
	private String finalStatus;
	
	
	private LocalDateTime InterviewTime;
	
	private Candidate candidate;

	private Employee employee;

	public InterviewScheduleDTO(int interviewScheduleID, float techRating, float hrRating, String finalStatus,
			LocalDateTime interviewTime, Candidate candidate, Employee employee) {
		super();
		this.interviewScheduleID = interviewScheduleID;
		this.techRating = techRating;
		this.hrRating = hrRating;
		this.finalStatus = finalStatus;
		InterviewTime = interviewTime;
		this.candidate = candidate;
		this.employee = employee;
	}

	public InterviewScheduleDTO() {
		// TODO Auto-generated constructor stub
		super();
	}

	public int getInterviewScheduleID() {
		return interviewScheduleID;
	}

	public void setInterviewScheduleID(int interviewScheduleID) {
		this.interviewScheduleID = interviewScheduleID;
	}

	public float getTechRating() {
		return techRating;
	}

	public void setTechRating(float techRating) {
		this.techRating = techRating;
	}

	public float getHrRating() {
		return hrRating;
	}

	public void setHrRating(float hrRating) {
		this.hrRating = hrRating;
	}

	public String getFinalStatus() {
		return finalStatus;
	}

	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}

	public LocalDateTime getInterviewTime() {
		return InterviewTime;
	}

	public void setInterviewTime(LocalDateTime interviewTime) {
		InterviewTime = interviewTime;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "InterviewScheduleDTO [interviewScheduleID=" + interviewScheduleID + ", techRating=" + techRating
				+ ", hrRating=" + hrRating + ", finalStatus=" + finalStatus + ", InterviewTime=" + InterviewTime
				+ ", candidate=" + candidate + ", employee=" + employee + "]";
	}

	
	

}
