package com.springdemo.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("----- Using Constructor Injection Autowiring -----");
		Coach tennisCoach = applicationContext.getBean("tennisCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());


		System.out.println("----- Using Setter Injection Autowiring -----");
		CricketCoach cricketCoach = applicationContext.getBean("cricketCoach", CricketCoach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());

		System.out.println("----- Using Method Injection Autowiring -----");
		FootballCoach footballCoach = applicationContext.getBean("footballCoach", FootballCoach.class);
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getDailyFortune());

		System.out.println("----- Using Field Injection Autowiring -----");
		VollyballCoach vollyballCoach = applicationContext.getBean("vollyballCoach", VollyballCoach.class);
		System.out.println(vollyballCoach.getDailyWorkout());
		System.out.println(vollyballCoach.getDailyFortune());
		
		applicationContext.close();
	}

}
