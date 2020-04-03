package com.springdemo.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigWithoutComponentScanDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportsConfig.class);

		Coach tennisCoach = applicationContext.getBean("swimCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());

		applicationContext.close();
	}

}
