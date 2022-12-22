package com.track.dto;

import com.track.entity.User;

public class CandidateDTO extends User{

		private String candidateName;
		private int interviewScheduleID;
		private String primarySkills;
		private String secondarySkills;
		private float experience;
		private String qualifications;
		private String noticePeriod;
		private String location;
		private String status;
		
		public CandidateDTO() {
			super();
		}
		public CandidateDTO(String candidateName, int interviewScheduleID, String primarySkills, String secondarySkills,
				float experience, String qualifications, String noticePeriod, String location, String status) {
			super();
			this.candidateName = candidateName;
			this.interviewScheduleID = interviewScheduleID;
			this.primarySkills = primarySkills;
			this.secondarySkills = secondarySkills;
			this.experience = experience;
			this.qualifications = qualifications;
			this.noticePeriod = noticePeriod;
			this.location = location;
			this.status = status;
		}


		public String getCandidateName() {
			return candidateName;
		}


		public void setCandidateName(String candidateName) {
			this.candidateName = candidateName;
		}


		public int getInterviewScheduleID() {
			return interviewScheduleID;
		}


		public void setInterviewScheduleID(int interviewScheduleID) {
			this.interviewScheduleID = interviewScheduleID;
		}


		public String getPrimarySkills() {
			return primarySkills;
		}


		public void setPrimarySkills(String primarySkills) {
			this.primarySkills = primarySkills;
		}


		public String getSecondarySkills() {
			return secondarySkills;
		}


		public void setSecondarySkills(String secondarySkills) {
			this.secondarySkills = secondarySkills;
		}


		public float getExperience() {
			return experience;
		}


		public void setExperience(float experience) {
			this.experience = experience;
		}


		public String getQualifications() {
			return qualifications;
		}


		public void setQualifications(String qualifications) {
			this.qualifications = qualifications;
		}


		public String getNoticePeriod() {
			return noticePeriod;
		}


		public void setNoticePeriod(String noticePeriod) {
			this.noticePeriod = noticePeriod;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		@Override
		public String toString() {
			return "CandidateDTO [candidateName=" + candidateName + ", interviewScheduleID=" + interviewScheduleID
					+ ", primarySkills=" + primarySkills + ", secondarySkills=" + secondarySkills + ", experience="
					+ experience + ", qualifications=" + qualifications + ", noticePeriod=" + noticePeriod + ", location="
					+ location + ", status=" + status + "]";
		}
		
		
		
		
	
}
