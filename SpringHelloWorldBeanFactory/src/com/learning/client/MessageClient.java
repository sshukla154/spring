package com.learning.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learning.entities.Message;

public class MessageClient {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Message message = (Message) beanFactory.getBean("message");
		System.out.println(message.toString());

		System.out.println("*****************");
		Message message1 = beanFactory.getBean("message", Message.class);
		System.out.println(message1.toString());

		System.out.println("*****************");
		String[] aliasNames = beanFactory.getAliases("message");
		for (String aliasName : aliasNames) {
			System.out.println(aliasName);
		}

		System.out.println("*****************");
		Message message2 = beanFactory.getBean(Message.class);
		System.out.println(message2.toString());

		System.out.println("*****************");
		Class<Message> clazzMessage = (Class<Message>) beanFactory.getType("message");
		System.out.println(clazzMessage.toString());
	}

}
