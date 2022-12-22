package com.track.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee extends User {

	
	private String type;
	private String location;
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	


	public Employee(int userID, String name, String gender, String userName, String password, String type,
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
		return "Employee [type=" + type + ", location=" + location + "]";
	}
	
	
	
}
