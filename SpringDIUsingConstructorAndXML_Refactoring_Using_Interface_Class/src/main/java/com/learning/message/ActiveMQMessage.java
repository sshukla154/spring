package com.learning.message;

public class ActiveMQMessage implements Messaging {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.learning.message.Messaging#sendMessage()
	 */
	@Override
	public void sendMessage() {
		System.out.println("Sending message via ActiveMQ");
	}
}
