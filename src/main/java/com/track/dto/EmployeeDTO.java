package com.track.dto;

import com.track.entity.User;

public class EmployeeDTO extends User {
	
	private String type;
	private String location;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int userID, String name, String gender, String userName, String password, String type,
			String location) {
		super(userID, name, gender, userName, password);
		this.type = type;
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [type=" + type + ", location=" + location + "]";
	}
	
	
}
