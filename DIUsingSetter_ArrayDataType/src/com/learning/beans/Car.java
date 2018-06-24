package com.learning.beans;

import java.util.Arrays;

public class Car {
	private String[] carNames;
	private Engine[] engines;

	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}

	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}

	public void printCarNameAndModelAvailable() {
		for (String carName : carNames) {
			for (Engine engine : engines) {
				System.out.println(carName + " is of model : " + engine);
			}
		}
	}

}
