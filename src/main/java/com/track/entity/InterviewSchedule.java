package com.track.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

@Entity
@Component
public class InterviewSchedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int interviewScheduleID;
	
	private float techRating;
	
	private float hrRating;
	
	private String finalStatus;
	
	@JsonDeserialize(using=LocalDateTimeDeserializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime InterviewTime;
	
	@OneToOne
	@JoinColumn(name="Candidate.userID")
	private Candidate candidate;
	
	@OneToMany(cascade = CascadeType.MERGE,fetch=FetchType.EAGER)
	@JoinColumn(name="Employee.userID")
	private List<Employee>employee=new ArrayList<>();
	
	
	

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




	public List<Employee> getEmployee() {
		return employee;
	}




	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}




	public InterviewSchedule() {
		super();
	}




	public InterviewSchedule(int interviewScheduleID, float techRating, float hrRating, String finalStatus,
			LocalDateTime interviewTime, Candidate candidate, List<Employee> employee) {
		super();
		this.interviewScheduleID = interviewScheduleID;
		this.techRating = techRating;
		this.hrRating = hrRating;
		this.finalStatus = finalStatus;
		InterviewTime = interviewTime;
		this.candidate = candidate;
		this.employee = employee;
	}




	@Override
	public String toString() {
		return "InterviewSchedule [interviewScheduleID=" + interviewScheduleID + ", techRating=" + techRating
				+ ", hrRating=" + hrRating + ", finalStatus=" + finalStatus + ", InterviewTime=" + InterviewTime
				+ ", candidate=" + candidate + ", employee=" + employee + "]";
	}
	
	
	

}
