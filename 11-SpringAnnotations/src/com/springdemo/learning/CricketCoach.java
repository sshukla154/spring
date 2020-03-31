package com.springdemo.learning;

import org.springframework.stereotype.Component;

//Using default beanId

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Pratice your batting !";
	}

}
