package com.springdemo;

public class BaseballCoach implements Coach {

	// Define a private field for the dependency
	private FortuneService fortuneService_variable;
	
	public BaseballCoach() {
		System.out.println("Inside - No args constructor - BaseballCoach()");
	}
	
	// Define a setter for dependency injection	
	public void setFortuneService(FortuneService fortuneService_parameter) {
		System.out.println("Inside - Setter - setFortuneService()");
		this.fortuneService_variable = fortuneService_parameter;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K !";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it : " + fortuneService_variable.getFortune_Setter();
	}

}
