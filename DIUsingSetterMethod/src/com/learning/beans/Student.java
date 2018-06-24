package com.learning.beans;

public class Student {

	private String gender;

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void helloStudent(String studentName) {
		System.out.println("Hello " + studentName + ", your gender as per our record is " + gender);

	}

}
