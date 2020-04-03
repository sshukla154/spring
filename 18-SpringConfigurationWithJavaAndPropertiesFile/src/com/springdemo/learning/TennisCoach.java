package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Partice your hand-volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
