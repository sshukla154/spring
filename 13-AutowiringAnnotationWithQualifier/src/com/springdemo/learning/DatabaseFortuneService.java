package com.springdemo.learning;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "DatabaseFortuneService.getFortune() : Today is your lucky day !";
	}

}
