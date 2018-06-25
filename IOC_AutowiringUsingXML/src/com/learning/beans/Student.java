package com.learning.beans;

public class Student {

	private int studentId;
	private String studentName;
	private String emailId;
	private Address address;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", emailId=" + emailId
				+ ", address=" + address + "]";
	}

}
