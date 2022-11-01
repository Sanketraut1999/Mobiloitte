package com.example.register.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class RegisterPage {
	@Id
	@Column(name="User_Id", unique = true, nullable = false)
	private String User_Id;
	private String First_Name;
	private String Last_Name;
	private String User_Name;
	private String Email;
	private Integer Phone_No;
	private String Password;
	private String DOB;
	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(Integer phone_No) {
		Phone_No = phone_No;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "RegisterPage [User_Id=" + User_Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", User_Name=" + User_Name + ", Email=" + Email + ", Phone_No=" + Phone_No + ", Password=" + Password
				+ ", DOB=" + DOB + "]";
	}
	
	
	


}
