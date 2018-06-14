package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.entities.PrototypeScopeMessage;

public class PrototypeScopeClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beansprototypescope.xml");
		
		PrototypeScopeMessage message1 = context.getBean("prototypeScopeMessage", PrototypeScopeMessage.class);	

		PrototypeScopeMessage message2 = context.getBean("prototypeScopeMessage", PrototypeScopeMessage.class);
		
		print("Message1 : " , message1);
		
		print("Message2 : " , message2);
		
		((AbstractApplicationContext) context).close();

	}

	private static void print(String message, PrototypeScopeMessage msg) {
		System.out.println(message +" have HashCode value : " + msg.hashCode());
		
	}

}
