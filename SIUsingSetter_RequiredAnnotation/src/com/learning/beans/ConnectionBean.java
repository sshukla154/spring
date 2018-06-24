package com.learning.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBean {

	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void printConnection() throws Exception {
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection);
	}

}
