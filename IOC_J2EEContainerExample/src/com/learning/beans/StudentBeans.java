package com.learning.beans;

public class StudentBeans {
	private int studentId;
	private String studentName;

	public StudentBeans() {
		System.out.println("StudentBeans Constructor... ");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String string) {
		this.studentName = string;
	}

	@Override
	public String toString() {
		return "StudentBeans [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
