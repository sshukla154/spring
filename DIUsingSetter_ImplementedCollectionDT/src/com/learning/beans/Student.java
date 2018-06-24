package com.learning.beans;

import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Vector;

public class Student {

	private Vector<String> studentNames;
	private TreeSet<String> subjects;
	private Hashtable<String, String> classAndMonitor;

	public void setStudentNames(Vector<String> studentNames) {
		this.studentNames = studentNames;
	}

	public void setSubjects(TreeSet<String> subjects) {
		this.subjects = subjects;
	}

	public void setClassAndMonitor(Hashtable<String, String> classAndMonitor) {
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
