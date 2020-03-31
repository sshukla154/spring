package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService_variable;
	
	public TrackCoach(FortuneService fortuneService_parameter) {
		this.fortuneService_variable = fortuneService_parameter;
	}
	
	public TrackCoach() {}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K !";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it : " + fortuneService_variable.getFortune();
	}

}
