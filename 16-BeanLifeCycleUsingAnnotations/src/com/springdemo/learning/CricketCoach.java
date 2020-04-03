package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	private FortuneService fortuneService_field;

	@Override
	public String getDailyWorkout() {
		return "Pratice fast bowling for 15min !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService_field.getFortune_Constructor();
	}
}
