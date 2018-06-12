package com.learning.service;

import com.learning.message.ActiveMQMessage;

public class Communication {

	private ActiveMQMessage activeMQMessage;

	public Communication(ActiveMQMessage activeMQMessage) {
		super();
		this.activeMQMessage = activeMQMessage;
	}
	
	public void communicate() {
		activeMQMessage.sendMessage();
	}

}
