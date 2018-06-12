package com.learning.message;

public class TibcoMessage implements Messaging {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.learning.message.Messaging#sendMessage()
	 */
	@Override
	public void sendMessage() {
		System.out.println("Sending message via Tibco");
	}
}
