package com.learning.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.learning.beans.StudentBeans;

public class BeanFactoryClient {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("resources/studentBean.xml"));
		StudentBeans studentBeans = beanFactory.getBean("studentBean", StudentBeans.class);
//		studentBeans.setStudentId(123);
//		studentBeans.setStudentName("Seemant Shukla");
//		System.out.println(studentBeans.toString());
	}

}
