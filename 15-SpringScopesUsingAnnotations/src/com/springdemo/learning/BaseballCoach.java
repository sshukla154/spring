package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class BaseballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K !";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it : " + fortuneService.getFortune_Setter();
	}

}
