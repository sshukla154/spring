package com.springdemo;

public class TrackCoach implements Coach {

	// Define a private field for the dependency
	private FortuneService fortuneService_variable;
	
	public TrackCoach() {}
	
	// Define a setter for dependency injection	
	public void setFortuneService(FortuneService fortuneService_parameter) {
		this.fortuneService_variable = fortuneService_parameter;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K !";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it : " + fortuneService_variable.getFortune();
	}

}
