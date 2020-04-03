package com.springdemo.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach defaultCoach1 = applicationContext.getBean("baseballCoach", Coach.class);
		Coach defaultCoach2 = applicationContext.getBean("baseballCoach", Coach.class);

		System.out.println("Default Scope (singleton) : Are both pointing to the same : " + (defaultCoach1 == defaultCoach2));
		System.out.println("Default Scope (singleton) : Momory Location: " + defaultCoach1 + " -- " + defaultCoach2);
		System.out.println(" ---------------- ");
		
		Coach singletoneCoach1 = applicationContext.getBean("cricketCoach", Coach.class);
		Coach singletoneCoach2 = applicationContext.getBean("cricketCoach", Coach.class);

		System.out.println("Singleton Scope : Are both pointing to the same : " + (singletoneCoach1 == singletoneCoach2));
		System.out.println("Singleton Scope : Momory Location: " + singletoneCoach1 + " -- " + singletoneCoach2);
		System.out.println(" ---------------- ");
		
		Coach prototypeCoach1 = applicationContext.getBean("footballCoach", Coach.class);
		Coach prototypeCoach2 = applicationContext.getBean("footballCoach", Coach.class);

		System.out.println("Prototype Scope : Are both pointing to the same : " + (prototypeCoach1 == prototypeCoach2));
		System.out.println("Prototype Scope : Momory Location: " + prototypeCoach1 + " -- " + prototypeCoach2);
		
	}

}
