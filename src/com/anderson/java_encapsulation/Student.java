package com.anderson.java_encapsulation;

public class Student {
	
	
	private int studentID;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	

	// empty parameter constructor, declare variables to default values
	public Student() {
		this.studentID = 0;
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.phone = "";
		
	}
	
	public Student(int studentID, String firstName, String lastName, String email, String phone) {
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phone=" + phone + "]";
	}
	
	
	
	
}
