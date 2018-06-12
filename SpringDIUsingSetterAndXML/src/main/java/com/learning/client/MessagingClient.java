package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.service.Communication;

public class MessagingClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Communication communication = applicationContext.getBean("communication", Communication.class);
		communication.communicate();
		((AbstractApplicationContext) applicationContext).close();
	}

}
