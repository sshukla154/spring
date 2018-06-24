package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.Student;

public class StudentClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/student.xml");
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student.toString());
	}

}
