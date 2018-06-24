package com.learning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beans.Car;

public class CarEngineClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		Car car = applicationContext.getBean("car", Car.class);
		car.printCarNameAndModelAvailable();
	}

}
