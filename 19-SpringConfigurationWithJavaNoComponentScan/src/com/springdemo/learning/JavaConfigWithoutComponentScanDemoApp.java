package com.springdemo.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigWithoutComponentScanDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SportsConfig.class);

		SwimCoach swimCoach = applicationContext.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println("Email : " + swimCoach.getEmail());
		System.out.println("Team : " + swimCoach.getTeam());

		applicationContext.close();
	}

}
