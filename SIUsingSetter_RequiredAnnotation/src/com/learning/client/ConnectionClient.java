package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.ConnectionBean;

public class ConnectionClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/connection.xml");
		applicationContext.getBean("connectionBean", ConnectionBean.class).printConnection();
	}

}
