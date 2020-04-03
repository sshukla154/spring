package com.springdemo.learning;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "HappyFortuneService.getFortune() : Today is your lucky day !";
	}

}
