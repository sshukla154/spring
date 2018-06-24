package com.learning.beans;

import java.util.Properties;

public class PropertiesBean {

	private Properties properties;

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void printPropertiesDetails() {
		properties.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
	}

}
