package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Pratice fast bowling for 15min !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune_Constructor();
	}
}
