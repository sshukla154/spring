package com.springdemo;

public class BaseballCoach implements Coach {

	// Define a private field for the dependency
	private FortuneService fortuneService_field;

	// Define a setter for dependency injection
	public void setFortuneService(FortuneService fortuneService_parameter) {
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
