package com.track.dto;


public class UserDTO {
	
	
	private int userID;
	private String name;
	private String gender;
	private String userName;
	private String password;
	
	public UserDTO(int userID, String name, String gender, String userName, String password) {
		super();
		this.userID = userID;
		this.name = name;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [userID=" + userID + ", name=" + name + ", gender=" + gender + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	
	
}
