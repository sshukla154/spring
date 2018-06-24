package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.PropertiesBean;


public class PropertiesClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/properties.xml");
		PropertiesBean propertiesBean =applicationContext.getBean("propertiesBean", PropertiesBean.class);
		propertiesBean.printPropertiesDetails();
	}

}
 