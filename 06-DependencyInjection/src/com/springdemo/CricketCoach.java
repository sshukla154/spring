package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService_field;

	public CricketCoach(FortuneService fortuneService_parameter) {
		System.out.println("Inside - Constructor - CricketCoach()");
		this.fortuneService_field = fortuneService_parameter;
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice fast bowling for 15min !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService_field.getFortune_Constructor();
	}
}
