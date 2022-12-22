package com.track.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Inheritance(strategy=InheritanceType.JOINED )

@DiscriminatorValue("user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;
	private String name;
	private String gender;
	private String userName;
	private String password;
	
	public User(int userID, String name, String gender, String userName, String password) {
		super();
		this.userID = userID;
		this.name = name;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		super();
		
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
		return "User [userID=" + userID + ", name=" + name + ", gender=" + gender + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	


}
