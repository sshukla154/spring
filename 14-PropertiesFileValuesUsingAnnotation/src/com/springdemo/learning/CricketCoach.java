package com.springdemo.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	@Value("${foo.email}")
	private String emailAddress;

	@Value("${foo.team}")
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside - No Args Constructor - CricketCoach()");
	}
	
	public String getEmailAddress() {
		System.out.println("Inside - Getter - getEmailAddress()");
		return emailAddress;
	}

	public String getTeam() {
		System.out.println("Inside - Getter - getTeam()");
		return team;
	}

	@Autowired
	private FortuneService fortuneService_field;

	@Override
	public String getDailyWorkout() {
		return "Pratice fast bowling for 15min !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService_field.getFortune_Constructor();
	}
}
