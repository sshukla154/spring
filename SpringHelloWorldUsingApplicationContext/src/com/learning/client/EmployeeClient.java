package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.learning.entities.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
//		System.out.println("Using ********* ClassPathXmlApplicationContext");
//		ApplicationContext classPathAC = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Employee employee1 = classPathAC.getBean(Employee.class);
//		System.out.println(employee1.toString());
//		

		System.out.println("Using ********* FileSystemXmlApplicationContext");
		//ApplicationContext fileSystemAC = new FileSystemXmlApplicationContext("C:\\gitworkspace\\KKLearning\\Spring\\SpringHelloWorldUsingApplicationContext\\src\\applicationContext.xml");
		//OR//ApplicationContext fileSystemAC = new FileSystemXmlApplicationContext("C:/gitworkspace/KKLearning/Spring/SpringHelloWorldUsingApplicationContext/src/applicationContext.xml");
		ApplicationContext fileSystemAC = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		Employee employee2 = fileSystemAC.getBean("employee", Employee.class);
		System.out.println(employee2.toString());

	}

}
