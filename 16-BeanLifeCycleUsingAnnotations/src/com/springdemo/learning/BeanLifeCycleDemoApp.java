package com.springdemo.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//Load the Spring Container file
		System.out.println("--- Reading applicationContext.xml Start --- ");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("--- Reading applicationContext.xml End --- ");
		
		Coach coach = context.getBean("baseballCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();

		
	}

}
