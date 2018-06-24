package com.learning.beans;

public class Student {
	private int studentId;
	private String studentName;
	private String emailId;
	private int age;

	public Student(int studentId, String studentName, String emailId, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", emailId=" + emailId + ", age="
				+ age + "]";
	}

}
