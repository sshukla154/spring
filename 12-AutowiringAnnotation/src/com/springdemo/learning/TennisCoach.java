package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		System.out.println("TennisCoach - Autowired Constructor");
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Partice your hand-volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
