package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Load the Spring Container file
		
		ClassPathXmlApplicationContext defaultContext = new ClassPathXmlApplicationContext("defaultScope-applicationContext.xml");
		
		Coach defaultCoach1 = defaultContext.getBean("myBaseballCoach", Coach.class);
		Coach defaultCoach2 = defaultContext.getBean("myBaseballCoach", Coach.class);

		System.out.println("Default Scope : Are both pointing to the same : " + (defaultCoach1 == defaultCoach2));
		System.out.println("Default Scope : Momory Location: " + defaultCoach1 + " -- " + defaultCoach2);
		System.out.println(" ---------------- ");
		
		ClassPathXmlApplicationContext singletoneContext = new ClassPathXmlApplicationContext("singletonScope-applicationContext.xml");
		
		Coach singletoneCoach1 = singletoneContext.getBean("myBaseballCoach", Coach.class);
		Coach singletoneCoach2 = singletoneContext.getBean("myBaseballCoach", Coach.class);

		System.out.println("Singleton Scope : Are both pointing to the same : " + (singletoneCoach1 == singletoneCoach2));
		System.out.println("Singleton Scope : Momory Location: " + singletoneCoach1 + " -- " + singletoneCoach2);
		System.out.println(" ---------------- ");
		
		ClassPathXmlApplicationContext prototypeContext = new ClassPathXmlApplicationContext("prototypeScope-applicationContext.xml");
		
		Coach prototypeCoach1 = prototypeContext.getBean("myBaseballCoach", Coach.class);
		Coach prototypeCoach2 = prototypeContext.getBean("myBaseballCoach", Coach.class);

		System.out.println("Prototype Scope : Are both pointing to the same : " + (prototypeCoach1 == prototypeCoach2));
		System.out.println("Prototype Scope : Momory Location: " + prototypeCoach1 + " -- " + prototypeCoach2);
		
	}

}
