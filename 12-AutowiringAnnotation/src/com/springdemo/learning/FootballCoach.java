package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	private FortuneService fortuneService;

	public FootballCoach() {
		System.out.println("FootballCoach : NoArgs Constructor");

	}

	@Autowired
	public void autowiringRandomMethod(FortuneService theFortuneService) {
		System.out.println("FootballCoah : Autowiring using random method");
		fortuneService = theFortuneService;
	} 
	
	@Override
	public String getDailyWorkout() {
		return "Improve you speed !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
