package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService_variable;
	
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K !";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it : " + fortuneService_variable.getFortune_Setter();
	}

}
