package com.springdemo.learning;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune_Setter() {
		return "Setter DI : Today is your Lucky Day !";
	}

	@Override
	public String getFortune_Constructor() {
		return "Constructor DI : Today is your Lucky Day !";
	}

}
