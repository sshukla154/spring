package com.learning.beans;

public class Car {
	private String carName;
	private Engine engine;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", engine=" + engine + "]";
	}

}
