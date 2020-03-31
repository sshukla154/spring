package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
		//Create a spring container
		System.out.println("ApplicationContext Start ---");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("ApplicationContext End ---");
		
		System.out.println("-------------- Working on Baseball Coach : ");
		//Retrive the bean from Spring Container
		Coach bean = context.getBean("myBaseballCoach", Coach.class);
		
		//Call menthod on the Bean
		System.out.println("getDailyWorkout() ===> " + bean.getDailyWorkout());
		
		//Lets call DI method
		System.out.println("getDailyFortune() ===> " + bean.getDailyFortune());
		
		System.out.println("-------------- Working on Cricket Coach : ");
		
		//Retrive the bean from Spring Container
		CricketCoach bean1 = context.getBean("myCricketCoach", CricketCoach.class);
		
		//Call method on the Bean
		System.out.println("getDailyWorkout() ===> " + bean1.getDailyWorkout());
		
		//Lets call DI method
		System.out.println("getDailyFortune() ===> " + bean1.getDailyFortune());
		
		//Close the Spring Container
		context.close();
		
	}

}
