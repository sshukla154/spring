package com.springdemo.learning;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RESTFortuneService.getFortune() : Today is your lucky day !";
	}

}
