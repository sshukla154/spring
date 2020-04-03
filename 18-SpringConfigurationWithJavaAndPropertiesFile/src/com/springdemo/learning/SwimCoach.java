package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public SwimCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 Mtr as a warm-up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
