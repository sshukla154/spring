package com.springdemo.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesValueDIDemoApp {

	public static void main(String[] args) {

		// Create a spring container
		System.out.println("--- ApplicationContext Start ---");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("--- ApplicationContext End ---");

		System.out.println("-------------- Working on Baseball Coach : ");
		// Retrive the bean from Spring Container
		CricketCoach bean = context.getBean("cricketCoach", CricketCoach.class);

		// Call menthod on the Bean
		System.out.println("getDailyWorkout() ===> " + bean.getDailyWorkout());

		// Lets call DI method
		System.out.println("getDailyFortune() ===> " + bean.getDailyFortune());
		
		//Values from properties files using Annotation 
		System.out.println("getEmailAddress() ===> "+ bean.getEmailAddress());
		System.out.println("getTeam() ===> "+bean.getTeam());


		// Close the Spring Container
		context.close();

	}

}
