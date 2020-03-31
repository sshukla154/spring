package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach - Noargs Constructor");
	}
	
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach - Autowired Setter()");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Pratice your balling !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
