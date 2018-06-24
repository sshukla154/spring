package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.Employee;

public class InheritanceClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = applicationContext.getBean("employee", Employee.class);
		System.out.println(emp.toString());
	}

}
