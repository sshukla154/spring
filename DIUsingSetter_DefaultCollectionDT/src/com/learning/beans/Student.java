package com.learning.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private List<String> studentNames;
	private Set<String> subjects;
	private Map<String, String> classAndMonitor;

	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	public void setClassAndMonitor(Map<String, String> classAndMonitor) {
		this.classAndMonitor = classAndMonitor;
	}

	public void printAllDetails() {
		System.out.println("~~~~~~~~ Student Name: Duplicates Allowed");
		studentNames.forEach(System.out::println);

		System.out.println("~~~~~~~~ Student Subjects: No Duplicates Allowed");
		subjects.forEach(System.out::println);

		System.out.println("~~~~~~~~ Class And Monitor: ");
		classAndMonitor.forEach((key, value) -> {
			System.out.println("Monitor of class " + key + " is " + value);
		});
	}

}
