package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.entities.Message;

public class DefaultScopeClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beansdefaultscope.xml");

		Message message1 = context.getBean("message", Message.class);

		Message message2 = context.getBean("message", Message.class);

		print("Message1 : ", message1);

		print("Message2 : ", message2); 
		
		((AbstractApplicationContext) context).close();

	}

	private static void print(String message, Message msg) {
		System.out.println(message + " have HashCode value : " + msg.hashCode());

	}

}
