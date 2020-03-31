package com.springdemo.learning;

import org.springframework.stereotype.Component;


//Using user-defined beanId

@Component("theSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Pratice your back-hand volley";
	}

}
