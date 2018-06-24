package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.StudentBeans;

public class ApplicationContextClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/studentBean.xml");

		StudentBeans studentBean1 = applicationContext.getBean("studentBean", StudentBeans.class);
		StudentBeans studentBean2 = applicationContext.getBean("studentBean", StudentBeans.class);
		StudentBeans studentBean3 = applicationContext.getBean("studentBean", StudentBeans.class);

		printValue("Student 1 : ", studentBean1, "Student 2 : ", studentBean2);
		printValue("Student 2 : ", studentBean2, "Student 3 : ", studentBean3);
		printValue("Student 3 : ", studentBean3, "Student 1 : ", studentBean1);

	}

	private static void printValue(String value1, StudentBeans studentBean1, String value2, StudentBeans studentBean2) {
		System.out.println(value1 + studentBean1.hashCode() + " ---AND--- " + value2 + studentBean2.hashCode());
	}

}
