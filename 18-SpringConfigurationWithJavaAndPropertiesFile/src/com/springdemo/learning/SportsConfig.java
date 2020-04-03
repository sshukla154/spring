package com.springdemo.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

//	@Bean
//	public FortuneService happyFortuneService() {
//		return new HappyFortuneService();
//	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		return mySwimCoach;
	}

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	

}
