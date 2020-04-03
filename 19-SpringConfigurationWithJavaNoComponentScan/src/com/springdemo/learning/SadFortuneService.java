package com.springdemo.learning;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "SadFortuneService.getFortune() : Today is not your lucky day !";
	}

}
