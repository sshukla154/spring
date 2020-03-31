package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//Load the Spring Container file
		System.out.println("--- Reading applicationContext.xml Start --- ");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("--- Reading applicationContext.xml Start --- ");
		
		Coach coach = context.getBean("myBaseballCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();

		
	}

}
