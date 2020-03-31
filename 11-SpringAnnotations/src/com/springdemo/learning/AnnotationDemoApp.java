package com.springdemo.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Using user-defined bean id in @component
		Coach tennisBean = applicationContext.getBean("theSillyCoach", Coach.class);
		System.out.println(tennisBean.getDailyWorkout());

		//Using default bean id in @component
		Coach cricketBean = applicationContext.getBean("cricketCoach", Coach.class);
		System.out.println(cricketBean.getDailyWorkout());

		applicationContext.close();
	}

}
