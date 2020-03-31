package com.springdemo;

public class BaseballCoach implements Coach {

	// Define a private field for the dependency
	private FortuneService fortuneService_field;

	// Define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService_parameter) {
		this.fortuneService_field = fortuneService_parameter;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 Min in Batting Pratice !";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get a fortune
		return fortuneService_field.getFortune();
	}
}
