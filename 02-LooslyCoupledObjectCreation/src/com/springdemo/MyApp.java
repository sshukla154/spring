package com.springdemo;

public class MyApp {

	// 1. App should be configurable
	// 2. Easily change the coach from one to another sport ie: Baseball, track,
	// Tennis etc
	public static void main(String[] args) {

		// Create the Object
		Coach coach = new BaseballCoach();

		// Use the object
		System.out.println(coach.getDailyWorkout());

		// OR

		// Create the Object
		Coach coach1 = new TrackCoach();

		// Use the object
		System.out.println(coach1.getDailyWorkout());

	}
}
