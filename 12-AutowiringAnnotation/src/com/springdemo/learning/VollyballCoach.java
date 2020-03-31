package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VollyballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	public VollyballCoach() {
		System.out.println("VollyballCoach - Noargs Constructor");
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
