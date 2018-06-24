package com.learning.service;

import com.learning.message.Messaging;

public class Communication {

	private Messaging message;

	public void setMessage(Messaging message) {
		this.message = message;
	}

	public void communicate() {
		message.sendMessage();
	}

}
