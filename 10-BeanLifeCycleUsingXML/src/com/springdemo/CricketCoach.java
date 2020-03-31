package com.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside - No Args Constructor - CricketCoach()");
	}
	
	public void setEmailAddress(String emailAdd) {
		System.out.println("Inside - Setter - setEmailAddress()");
		this.emailAddress = emailAdd;
	}
	
	public void setTeam(String team) {
		System.out.println("Inside - Setter - setTeam()");
		this.team = team;
	}
	
	public String getEmailAddress() {
		System.out.println("Inside - Getter - getEmailAddress()");
		return emailAddress;
	}

	public String getTeam() {
		System.out.println("Inside - Getter - getTeam()");
		return team;
	}

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
