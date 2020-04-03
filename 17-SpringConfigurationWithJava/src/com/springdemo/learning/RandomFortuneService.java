package com.springdemo.learning;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create array of String
	private String [] data = {"Beware of Wolf in Sheep's clothing",
			"Deligence is the mother of good luck",
			"The journey is the reward"
			};
	
	//create a random number genrator
	private Random random = new Random();
	
	
	@Override
	public String getFortune() {
		//pick random string from the array
		int index = random.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
