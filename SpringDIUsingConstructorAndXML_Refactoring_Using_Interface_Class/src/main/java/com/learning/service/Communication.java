package com.learning.service;

import com.learning.message.Messaging;

public class Communication {

	private Messaging message;

	public Communication(Messaging message) {
		super();
		this.message = message;
	}

	public void communicate() {
		message.sendMessage();
	}

}
