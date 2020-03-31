package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
		//Create a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive the bean from Spring Container
		Coach bean = context.getBean("myCoach", Coach.class);
		
		//Call menthod on the Bean
		System.out.println(bean.getDailyWorkout());
		
		//Close the Spring Container
		context.close();
		
	}

}
